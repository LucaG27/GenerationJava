package com.galiero.pop.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.pop.dal.ProvinciaDAO;
import com.galiero.pop.entities.Provincia;

@Service
public class PopolazioneServiceImpl implements PopolazioneService {

	@Autowired
	private ProvinciaDAO repo;

	private Map<Integer, Provincia> province = new TreeMap<>();
	
	private void init() {
		List<Provincia> findAll = repo.findAll();
		
		for (Provincia p : findAll) {
			province.put(p.getId(), p);
		}
	}
	
	@Override
	public List<Provincia> getProvince() {

		return repo.findAll();
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {

		return repo.findProvinciaByRegione(regione);
	}

	@Override
	public List<String> getRegioni() {

		return repo.findAll()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.collect(Collectors.toList())
				;
	}

	@Override
	public Provincia getProvinciaByComune(String comune) {
		return repo.findProvinciaByComune(comune);
	}
}
