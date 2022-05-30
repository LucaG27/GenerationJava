package it.es.gestionale.service;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import it.es.gestionale.model.ArticoloEntity;
import it.es.gestionale.repository.ArticoloDB;

@Service
public class ArticoloService {

	@Autowired
	ArticoloDB db;

	public ArticoloEntity findById(int id) {
		return db.findById(id).get();
	}

	public List<ArticoloEntity> getAllArticoli() {
		return db.findAll(); //Passacarte
	}

	public ArticoloEntity saveArticolo(ArticoloEntity a){
		return db.save(a);
	}

	public void deleteArticolo(int id) {
		db.delete(db.getById(id));
	}

	public ArticoloEntity getByid(int id) {
		return db.findById(id).orElse(new ArticoloEntity());
	}

	public List<ArticoloEntity> getArticoliByDescrizione(String descrizione) {
		return db.findByDescrizioneContainsIgnoreCase(descrizione); //Passacarte
	}

	public List<ArticoloEntity> getArticoliByPrezzo(double p1, double p2) {
		return db.findByPrezzo(p1, p2); //Passacarte
	}

	public List<ArticoloEntity> getArticoliByCategoria(String categoria) {
		return db.findByCategoriaContainsIgnoreCase(categoria); //Passacarte
	}

	public void importCsv(MultipartFile file){

		try {

			InputStreamReader isr = new InputStreamReader(file.getInputStream(), "UTF-8"); //Permette di ottenere il flusso di dati
			BufferedReader buffer = new BufferedReader(isr); //Prassi per la lettura del flusso

			CsvToBean <ArticoloEntity> csv = new CsvToBeanBuilder<ArticoloEntity>(buffer)
					.withSeparator(';')
					.withIgnoreLeadingWhiteSpace(true)
					.withType(ArticoloEntity.class).build();
			List<ArticoloEntity> listaCsv = csv.parse();
			db.saveAll(listaCsv);	

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/* Carica i dati dal database e li mette nel CSV */
	public String exportCsv(){
		final String sep=";";
		final String aCapo="\n";
		final String fileName="file.csv";

		List<ArticoloEntity> lista = db.findAll();


		try{
			FileWriter csvWriter = new FileWriter(fileName);
			csvWriter.append("descrizione"+sep+"prezzo"+sep+"categoria"+sep+"rimanenza"+aCapo);

			for(ArticoloEntity art : lista){
				csvWriter.append(art.getDescrizione()+sep+art.getPrezzo()+sep+art.getCategoria()+sep+art.getRimanenza()+aCapo);
			}

			csvWriter.flush();
			csvWriter.close();

			return fileName;

		}catch(IOException ioe){

		}
		return null;
	}
}
