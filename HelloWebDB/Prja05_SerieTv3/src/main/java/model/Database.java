package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private static Database instance;
	
	private List<SerieTv> listaSerie;
	
	private Database() {
		listaSerie = new ArrayList<>();
		listaSerie.add(new SerieTv(0,"Scrubs", "Comedy", "prova123", "www"));
		listaSerie.add(new SerieTv(1,"Scrubs", "Comedy", "prova123", "www"));
		listaSerie.add(new SerieTv(2,"Scrubs", "Comedy", "prova123", "www"));
	}
    public static Database getDatabase() {
    	if (instance ==null) {
    		instance = new Database();
    	}
    	return instance;
    }
    
    public List<SerieTv> getLista(){
    	
    	return listaSerie;
    }

    	public List<SerieTv> getSerieByGenere(String genere) {

    		List<SerieTv> serieGenere = new ArrayList<SerieTv>();

    		for (SerieTv s : this.listaSerie) {
    			if (s.getGenere().equals(genere))
    				serieGenere.add(s);
    		}
    		return serieGenere;
    }
    
}
