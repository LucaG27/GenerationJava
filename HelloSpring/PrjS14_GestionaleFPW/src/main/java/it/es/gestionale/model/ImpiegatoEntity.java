package it.es.gestionale.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "impiegato")
public class ImpiegatoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="nome", length = 50, nullable = true)
	private String nome;

	@Column(name="cognome", length = 100, nullable = true)
	private String cognome;

	private String ruolo;

	@ManyToOne
	@JoinColumn(name="rif_to", referencedColumnName = "id")
	private ImpiegatoEntity dirigente;

	private double stipendio;

	@ManyToOne
	@JoinColumn(name="ufficio_id")
	//@JsonIgnore
	private UfficioEntity ufficio;

	@OneToMany(mappedBy ="impiegato")
	@JsonIgnore
	private List<OrdineEntity> ordini;

	//    @OneToOne(mappedBy = "impiegato")
	//    private LoginEntity login;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public UfficioEntity getUfficio() {
		return ufficio;
	}

	public void setUfficio(UfficioEntity ufficio) {
		this.ufficio = ufficio;
	}

	public List<OrdineEntity> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<OrdineEntity> ordini) {
		this.ordini = ordini;
	}
	//
	//	public LoginEntity getLogin() {
	//		return login;
	//	}
	//
	//	public void setLogin(LoginEntity login) {
	//		this.login = login;
	//	}

	public ImpiegatoEntity getDirigente() {
		return dirigente;
	}

	public void setDirigente(ImpiegatoEntity dirigente) {
		this.dirigente = dirigente;
	}
}
