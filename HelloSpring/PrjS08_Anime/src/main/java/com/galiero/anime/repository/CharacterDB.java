package com.galiero.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacterDB extends JpaRepository<Character, String> {

}
