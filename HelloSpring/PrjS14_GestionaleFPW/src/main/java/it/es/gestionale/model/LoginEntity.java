package it.es.gestionale.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="login")
public class LoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String email;
	private String password;
	private String ruolo;
	private String nome;
	private String cognome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName="id")
	private ClienteEntity cliente;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "impiegato_id", referencedColumnName="id")
	private ImpiegatoEntity impiegato;

	public LoginEntity(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public ImpiegatoEntity getImpiegato() {
		return impiegato;
	}

	public void setImpiegato(ImpiegatoEntity impiegato) {
		this.impiegato = impiegato;
	}
}
