package com.galiero.popolazione.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.popolazione.model.Regione;
import com.galiero.popolazione.repository.RegioneDB;

@Service
public class RegioneService {

	@Autowired
	RegioneDB dbReg;

	NumberFormat nf = new DecimalFormat("#0.00");

	public List<Regione> getListaRegioni() {
		return dbReg.findAll();
	}        

	public List<String> getRegioni() {
		
		return null;
		
	}
	
	public Regione getComune(String regione, String comune) {
		return dbReg.getByRegioneAndComune(regione, comune);
	}

	public String getPercentualeOnRegione(Regione regione) {

		return nf.format((double)regione.getTotale()/dbReg.getTotaleRegione(regione.getRegione())*100);
	}

	public String getPercentualeOnItalia(Regione regione) {

		return nf.format(((double)regione.getTotale()/dbReg.getTotaleItalia())*100);
	}

	public String getPercentualeMaschi(Regione regione) {

		return nf.format(((double)regione.getMaschi()/regione.getTotale())*100);
	}

	public String getPercentualeFemmine(Regione regione) {

		return nf.format(((double)regione.getFemmine()/regione.getTotale())*100);
	}

}