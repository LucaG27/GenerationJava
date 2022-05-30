package com.galiero.popolazione.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galiero.popolazione.model.EtaEntity;
import com.galiero.popolazione.model.Regione;
import com.galiero.popolazione.repository.EtaDB;
import com.galiero.popolazione.repository.RegioneDB;

@Service
public class EtaService {

	@Autowired
	EtaDB dbEta;

	NumberFormat nf = new DecimalFormat("#0.00");

	public List<EtaEntity> getListaEta() {
		return dbEta.findAll();
	}        


	public EtaEntity getEtaIntervall(int eta1, int eta2) {
		return dbEta.getEtaIntervall(eta1, eta2);
	}

	public String getPercentualeMaschi(int eta1, int eta2) {

		return nf.format(((double)dbEta.getSumMaschi(eta1, eta2))/(dbEta.getSumTotale(eta1, eta2))*100);
	}

	public String getPercentualeFemmine(int eta1, int eta2) {

		return nf.format((dbEta.getSumFemmine(eta1, eta2))/(dbEta.getSumTotale(eta1, eta2))*100);
	}

}