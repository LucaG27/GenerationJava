package com.galiero.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.anime.model.Anime;

@Repository
public interface AnimeDB extends JpaRepository<Anime, String> {

}
