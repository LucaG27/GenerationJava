package com.galiero.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.dal.AlimentoDAO;
import com.galiero.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	
	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void updAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void delAlimento(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public List<Alimento> getAlimenti() {
		return this.repo.findAll();
		
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		return repo.findByCategoria(categoria);
		
	}

	@Override
	public Alimento getAlimentoById(int id) {
		return this.repo.getById(id);
		
	}

	@Override
	public List<String> getCategorie() {
		return getAlimenti()
				.stream()
				.map(a -> a.getCategoria())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
}
