package com.galiero.animeManga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galiero.animeManga.model.Utente;

@Repository
public interface UtenteDB extends JpaRepository<Utente, Integer>{

}
