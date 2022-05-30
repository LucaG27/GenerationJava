package com.galiero.SerieTv.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.galiero.SerieTv.model.SerieTV;

@Repository
public class Database {

	private List<SerieTV> listaSerie;

	private Database() {
		listaSerie = new ArrayList<>();
		listaSerie.add(new SerieTV(1, "Scrubs", "Comedy", "Descrizione", "Foto"));
		listaSerie.add(new SerieTV(2, "Snowpierce", "Action", "Descrizione", "Foto"));
		listaSerie.add(new SerieTV(3, "Anna", "Genere1", "Descrizione", "Foto"));
		listaSerie.add(new SerieTV(4, "La regina di scacchi", "Genere2", "Descrizione", "Foto"));
	}

	public List<SerieTV> getLista() {

		return listaSerie;
	}

	public SerieTV getById(int id) {
		for (SerieTV serieTV : listaSerie) {
			if (id == serieTV.getId())

				return serieTV;
		}
		return null;
	}

	public void deleteById(int id) {

		listaSerie.remove(id);
	}

	public List<SerieTV> getSerieByGen(String genere) {

		List<SerieTV> serieGenere = new ArrayList<>();
		for (SerieTV serieTV : listaSerie) {
			if (serieTV.getGenere().equals(genere))
				serieGenere.add(serieTV);
		}
		return serieGenere;
	}
	
	public void saveById(SerieTV s) {
		SerieTV old = getById(s.getId());
		listaSerie.remove(old);
		listaSerie.add(s);
	}
}
