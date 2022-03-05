package model;

public class Canzone {

	private int id;
	private String titolo;
	private String cantane;

	public Canzone() {
	}

	public Canzone(int id, String titolo, String cantane) {
		this.id = id;
		this.titolo = titolo;
		this.cantane = cantane;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCantane() {
		return cantane;
	}

	public void setCantane(String cantane) {
		this.cantane = cantane;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + ", cantane=" + cantane + "]";
	}

}
