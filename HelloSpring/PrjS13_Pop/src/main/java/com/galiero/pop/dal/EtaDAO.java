package com.galiero.pop.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galiero.pop.entities.Eta;

public interface EtaDAO extends JpaRepository<Eta, Integer> {

	List<Eta> findEta(String regione);
	Eta findEtaMaschi(int eta);
	Eta findEtaFemmine(int eta);
}
