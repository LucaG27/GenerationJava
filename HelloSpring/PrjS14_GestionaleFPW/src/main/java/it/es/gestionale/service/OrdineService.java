package it.es.gestionale.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.es.gestionale.model.OrdineEntity;
import it.es.gestionale.model.ArticoloDTO;
import it.es.gestionale.model.DettaglioEntity;
import it.es.gestionale.model.OrdineDTO;
import it.es.gestionale.repository.DettaglioDB;
import it.es.gestionale.repository.OrdineDB;

@Service
public class OrdineService {

	@Autowired
	OrdineDB dbOrd;

	@Autowired
	DettaglioDB dbDet;

	public List<OrdineDTO> getOrdini() {

		return getListOrdiniByCriteria(dbOrd.findAll());
	}

	public List<OrdineDTO> getOrdiniByImpiegato(int id){

		return getListOrdiniByCriteria(dbOrd.findByImpiegato(id));
	}

	public List<OrdineDTO> getOrdiniByCliente(int id){

		return getListOrdiniByCriteria(dbOrd.findByCliente(id));

	}

	public OrdineEntity getOrdineById(int id) {
		return dbOrd.getById(id);
	}

	public List<OrdineDTO> getListOrdiniByCriteria(List<OrdineEntity> lista){
		List<OrdineDTO> listaOrdini = new ArrayList<>();
		double somma = 0;

		for(OrdineEntity o : lista) {

			List<DettaglioEntity> listaDettagli = dbDet.getDettagliByOrdine(o.getId());
			for(DettaglioEntity d : listaDettagli) {
				somma+=d.getArticolo().getPrezzo()*d.getQuantita();
			}
			listaOrdini.add(new OrdineDTO(o, somma));
			somma = 0;
		}

		return listaOrdini;
	}

	public List<ArticoloDTO> getProdottiByOrdine(int id){

		List<DettaglioEntity> listaDettagli = dbOrd.getById(id).getDettagli();
		List<ArticoloDTO> lista = new ArrayList<>();

		for(DettaglioEntity d : listaDettagli) {
			lista.add(new ArticoloDTO(d.getArticolo(), d.getQuantita()));
		}
		return lista;

	}

	public String exportCsv(){
		final String sep=";";
		final String aCapo="\n";
		final String fileName="file.csv";

		List<OrdineEntity> lista = dbOrd.findAll();


		try{
			FileWriter csvWriter = new FileWriter(fileName);
			csvWriter.append("cliente"+sep+"impiegato"+sep+"data"+sep+"consegna"+aCapo);

			for(OrdineEntity art : lista){
				csvWriter.append(art.getCliente().getId()+sep+art.getImpiegato().getId()+sep+art.getData()+sep+art.getConsegna()+aCapo);
			}

			csvWriter.flush();
			csvWriter.close();

			return fileName;

		}catch(IOException ioe){

		}
		return null;
	}
}

