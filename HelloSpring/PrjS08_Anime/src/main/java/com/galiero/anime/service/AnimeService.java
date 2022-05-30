package com.galiero.anime.service;

import java.util.List;

import com.galiero.anime.model.Anime;

public interface AnimeService {
	
	void addAnime(Anime a);
	void updAnime(Anime a);
	void delAnime(String animeName);
	
	List<Anime> getAnime();
}
