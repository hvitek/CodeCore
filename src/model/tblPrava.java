package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the prava database table.
 * 
 */
@Entity
@NamedQuery(name="Prava.findAll", query="SELECT p FROM Prava p")
public class tblPrava implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nazev;

	//bi-directional many-to-one association to Pravaxskupinaprav
	@OneToMany(mappedBy="prava")
	private List<PravaXSkupinaPrav> pravaxskupinapravs;

	public tblPrava() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNazev() {
		return this.nazev;
	}

	public void setNazev(String nazev) {
		
		this.nazev = nazev;
	}

	public List<PravaXSkupinaPrav> getPravaxskupinapravs() {
		return this.pravaxskupinapravs;
	}

	public void setPravaxskupinapravs(List<PravaXSkupinaPrav> pravaxskupinapravs) {
		this.pravaxskupinapravs = pravaxskupinapravs;
	}

	public PravaXSkupinaPrav addPravaxskupinaprav(PravaXSkupinaPrav pravaxskupinaprav) {
		getPravaxskupinapravs().add(pravaxskupinaprav);
		pravaxskupinaprav.setPrava(this);

		return pravaxskupinaprav;
	}

	public PravaXSkupinaPrav removePravaxskupinaprav(PravaXSkupinaPrav pravaxskupinaprav) {
		getPravaxskupinapravs().remove(pravaxskupinaprav);
		pravaxskupinaprav.setPrava(null);

		return pravaxskupinaprav;
	}

}