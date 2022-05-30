package com.delprete.anime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.galiero.anime.model.Anime;
import com.galiero.anime.repository.AnimeDB;
import com.galiero.anime.repository.CharacterDB;
import com.galiero.anime.repository.EpisodeDB;
import com.galiero.anime.repository.MangaDB;
import com.galiero.anime.repository.VoiceActorDB;

@SpringBootTest
class AnimeApplicationTests {
	
	@Autowired
	AnimeDB aDB;
	@Autowired
	CharacterDB cDB;
	@Autowired
	EpisodeDB eDB;
	@Autowired
	MangaDB mDB;
	@Autowired
	VoiceActorDB vDB;

	@Test
	void contextLoads() {
		Anime an = aDB.findAll().get(0);
		assertNotNull (an);
	}

}
