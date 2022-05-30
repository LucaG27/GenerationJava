package com.galiero.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.anime.model.Anime;
import com.galiero.anime.model.VoiceActor;

@Repository
public interface VoiceActorDB extends JpaRepository<VoiceActor, String> {

}
