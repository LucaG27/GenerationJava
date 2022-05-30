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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import it.es.gestionale.service.ArticoloService;

@Controller
public class ArticoloCtrl {

	@Autowired
	ArticoloService srv;

	//	@GetMapping()
	//	public String preload(Model model) {
	//		model.addAttribute("articoloForm", new ArticoloEntity());
	//		return "articolo_editor";
	//	}

	@GetMapping("/lista-articoli")
	public String list(Model model, HttpSession session) {

		if(session.getAttribute("utenteLoggato") == null) return "redirect:/login-page";
		else return "articolo";
	}

	@GetMapping("/export")
	public ResponseEntity downloadArticoli() throws IOException {

		String outFile = srv.exportCsv();

		if (outFile != null) {
			File download = new File(outFile);
			InputStreamResource resource = new InputStreamResource(new FileInputStream(download));

			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + "exportedArticoli.csv")
					.contentLength(download.length())
					.contentType(MediaType.APPLICATION_OCTET_STREAM)
					.body(resource);
		}

		return null;
	}

	@PostMapping("/import")
	public String insertCSVArticoli(@RequestPart("fileCSV") MultipartFile file) {

		srv.importCsv(file);
		return "redirect:/lista-articoli";

	}

	//	@PostMapping("/save")
	//	public String saveArt(Model model, ArticoloEntity articoloForm, @RequestParam(name="image") MultipartFile immagine) {
	//
	//		if(immagine!=null){
	//			try{
	//				String percorso=fs.saveFile("img/articoli", articoloForm.getDescrizione()+immagine.getName(), immagine);
	//				articoloForm.setImmagine(percorso);
	//			}catch(IOException e){
	//				e.printStackTrace();
	//			}
	//		}
	//
	//		artdb.save(articoloForm);
	//		return "redirect:/articolo/lista";
	//	}
}
