//package com.galiero.animeManga.integration;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.galiero.animeManga.model.AnimeManga;
//import com.galiero.animeManga.service.AnimeMangaService;
//import com.galiero.animeManga.service.UtenteService;
//
//@RestController
//@RequestMapping({"api","rest"})
//@SessionAttributes("utente")
//public class AnimeMangaREST {
//
//	@Autowired
//	AnimeMangaService AMsrv;
//	UtenteService uSrv;
//	
//	@GetMapping
//	public List<AnimeManga> getAnimeManga() {
//		return AMsrv.getListaAM();
//	}
//	
//	
//}
