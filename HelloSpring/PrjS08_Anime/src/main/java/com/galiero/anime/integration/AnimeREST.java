package com.galiero.anime.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galiero.anime.model.Anime;
import com.galiero.anime.service.AnimeService;


public class AnimeREST {
	@RestController
	@RequestMapping({"api","rest"}) // -> può essere chiamato sia da /api che da /rest
	public class AlimentoREST {
		
		@Autowired
		private AnimeService service;
		
		@GetMapping
		public List<Anime> getAnime(){
			return service.getAnime();
		}
		
		
		@PostMapping 
		public void addAnime(@RequestBody Anime a) {
			service.addAnime(a);
		}
		
		@PutMapping
		public void updAnime(@RequestBody Anime a) {
			service.updAnime(a);
		}
		@DeleteMapping("/{animeName}")
		public void delAlimento(@PathVariable String animeName) {
			service.delAnime(animeName);
		}

	}


}
