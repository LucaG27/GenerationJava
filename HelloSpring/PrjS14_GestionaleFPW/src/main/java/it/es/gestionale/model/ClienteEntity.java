package it.es.gestionale.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String cognome;
	private String nome;
	private String telefono;
	private String email;
	private String indirizzo;
	private String citta;
	private String provincia;
	private String regione;
	private Integer credito;

	@OneToMany(mappedBy = "cliente")
	@JsonIgnore
	private List<OrdineEntity> ordini;

	//    @OneToOne(mappedBy="cliente")
	//    private LoginEntity login;

	public ClienteEntity() {}   

	public ClienteEntity(String cognome, String nome, String telefono, String email, String indirizzo, String citta,
			String provincia, String regione) {

		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	public List<OrdineEntity> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<OrdineEntity> ordini) {
		this.ordini = ordini;
	}

	//	public LoginEntity getLogin() {
	//		return login;
	//	}
	//
	//	public void setLogin(LoginEntity login) {
	//		this.login = login;
	//	}
}
