package it.es.gestionale.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.es.gestionale.service.LoginService;

@Controller
public class LoginCtrl {

	@Autowired
	LoginService srv;

	//	@GetMapping()
	//	public String preload(Model model) {
	//		model.addAttribute("articoloForm", new ArticoloEntity());
	//		return "articolo_editor";
	//	}

	@GetMapping("/login-page")
	public String list(Model model, HttpSession session) {

		if(session.getAttribute("utenteLoggato") == null) return "login";
		else return "homepage";
	}

	@GetMapping("/logout")
	public String logout(Model model, HttpSession session) {
		session.setAttribute("utenteLoggato", null);
		return "redirect:/login-page";
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
