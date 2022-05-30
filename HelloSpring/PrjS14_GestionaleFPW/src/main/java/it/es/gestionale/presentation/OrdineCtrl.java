package it.es.gestionale.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.es.gestionale.model.LoginEntity;
import it.es.gestionale.service.OrdineService;

@Controller
@RequestMapping("/lista-ordini")
public class OrdineCtrl {

	@Autowired
	OrdineService srv;

	@GetMapping
	public String getListaOrdini(HttpSession session) {
			/* ------------------- se utente è loggato eseguo il resto ------------------ */
		if(session.getAttribute("utenteLoggato") == null) return "redirect:/login-page";

		LoginEntity l = (LoginEntity) session.getAttribute("utenteLoggato");
		if(l.getRuolo().equals("cliente")) return "ordini-cliente";
		if(l.getRuolo().equals("impiegato")) return "ordini-impiegato";

		return "ordini";
	}

	@GetMapping("/exportOrdini")
	public ResponseEntity downloadOrdini() throws IOException {

		String outFile = srv.exportCsv();

		if (outFile != null) {
			File download = new File(outFile);
			InputStreamResource resource = new InputStreamResource(new FileInputStream(download));

			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "exportedOrdini.csv")
					.contentLength(download.length())
					.contentType(MediaType.APPLICATION_OCTET_STREAM)
					.body(resource);
		}
		return null;
	}
}
