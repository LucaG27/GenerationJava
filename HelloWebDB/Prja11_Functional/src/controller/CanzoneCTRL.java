package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Canzone;

public class CanzoneCTRL {
	
	private Map<Integer, Canzone> canzoni;
	
	public CanzoneCTRL() {
		this.canzoni = new HashMap<>();
	}
	
	public void addCanzone(Canzone c) {
		this.canzoni.put(c.getId(), c);
	}
	
	public Canzone getCanzone (int id) {
		
		return this.canzoni.get(id);
	}
	
	public void delCanzone (int id) {
		
		this.canzoni.remove(id);
	}
	
	public List<Canzone> getCanzoniList(){
		List<Canzone> canzoni = new ArrayList<>(this.canzoni.values());
		return getCanzoniList();
	}
	
}
