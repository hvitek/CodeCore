package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the wf database table.
 * 
 */
@Entity
@NamedQuery(name="Wf.findAll", query="SELECT w FROM Wf w")
public class Wf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="dostupne_stavy")
	private String dostupneStavy;

	private String nazev;

	private String objekt;

	private String stav;

	//bi-directional many-to-one association to Prava
	@OneToMany(mappedBy="wfBean")
	private List<Prava> pravas;

	public Wf() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDostupneStavy() {
		return this.dostupneStavy;
	}

	public void setDostupneStavy(String dostupneStavy) {
		this.dostupneStavy = dostupneStavy;
	}

	public String getNazev() {
		return this.nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public String getObjekt() {
		return this.objekt;
	}

	public void setObjekt(String objekt) {
		this.objekt = objekt;
	}

	public String getStav() {
		return this.stav;
	}

	public void setStav(String stav) {
		this.stav = stav;
	}

	public List<Prava> getPravas() {
		return this.pravas;
	}

	public void setPravas(List<Prava> pravas) {
		this.pravas = pravas;
	}

	public Prava addPrava(Prava prava) {
		getPravas().add(prava);
		prava.setWfBean(this);

		return prava;
	}

	public Prava removePrava(Prava prava) {
		getPravas().remove(prava);
		prava.setWfBean(null);

		return prava;
	}

}