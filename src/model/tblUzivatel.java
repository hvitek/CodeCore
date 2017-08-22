package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uzivatel database table.
 * 
 */
@Entity
@NamedQuery(name="Uzivatel.findAll", query="SELECT u FROM Uzivatel u")
public class tblUzivatel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String jmeno;

	private String prijmeni;

	//bi-directional many-to-one association to Skupinaprav
	@ManyToOne
	@JoinColumn(name="fk_skupinaprav")
	private tblSkupinaPrav skupinaprav;

	public tblUzivatel() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJmeno() {
		return this.jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPrijmeni() {
		return this.prijmeni;
	}

	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}

	public tblSkupinaPrav getSkupinaprav() {
		return this.skupinaprav;
	}

	public void setSkupinaprav(tblSkupinaPrav skupinaprav) {
		this.skupinaprav = skupinaprav;
	}

}