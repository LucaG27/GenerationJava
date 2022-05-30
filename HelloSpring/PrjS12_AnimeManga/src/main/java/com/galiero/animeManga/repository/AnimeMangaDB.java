package com.galiero.animeManga.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.animeManga.model.AnimeManga;

@Repository
public interface AnimeMangaDB extends JpaRepository<AnimeManga, Integer> {

	
}
