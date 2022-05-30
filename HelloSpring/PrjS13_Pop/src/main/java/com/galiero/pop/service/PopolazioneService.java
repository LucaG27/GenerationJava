package com.galiero.pop.service;

import java.util.List;

import com.galiero.pop.entities.Provincia;

public interface PopolazioneService {

	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione(String regione);
	List<String> getRegioni();
	Provincia getProvinciaByComune(String comune);
	
	
	
}
