package com.galiero.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.anime.model.Anime;
import com.galiero.anime.model.Episode;

@Repository
public interface EpisodeDB extends JpaRepository<Episode, String> {

}
