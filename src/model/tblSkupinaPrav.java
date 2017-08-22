package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the skupinaprav database table.
 * 
 */
@Entity
@NamedQuery(name="Skupinaprav.findAll", query="SELECT s FROM Skupinaprav s")
public class tblSkupinaPrav implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	private Integer id;

	//bi-directional many-to-one association to Pravaxskupinaprav
	@OneToMany(mappedBy="skupinaprav")
	private List<PravaXSkupinaPrav> pravaxskupinapravs;

	//bi-directional many-to-one association to Uzivatel
	@OneToMany(mappedBy="skupinaprav")
	private List<tblUzivatel> uzivatels;

	public tblSkupinaPrav() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<PravaXSkupinaPrav> getPravaxskupinapravs() {
		return this.pravaxskupinapravs;
	}

	public void setPravaxskupinapravs(List<PravaXSkupinaPrav> pravaxskupinapravs) {
		this.pravaxskupinapravs = pravaxskupinapravs;
	}

	public PravaXSkupinaPrav addPravaxskupinaprav(PravaXSkupinaPrav pravaxskupinaprav) {
		getPravaxskupinapravs().add(pravaxskupinaprav);
		pravaxskupinaprav.setSkupinaprav(this);

		return pravaxskupinaprav;
	}

	public PravaXSkupinaPrav removePravaxskupinaprav(PravaXSkupinaPrav pravaxskupinaprav) {
		getPravaxskupinapravs().remove(pravaxskupinaprav);
		pravaxskupinaprav.setSkupinaprav(null);

		return pravaxskupinaprav;
	}

	public List<tblUzivatel> getUzivatels() {
		return this.uzivatels;
	}

	public void setUzivatels(List<tblUzivatel> uzivatels) {
		this.uzivatels = uzivatels;
	}

	public tblUzivatel addUzivatel(tblUzivatel uzivatel) {
		getUzivatels().add(uzivatel);
		uzivatel.setSkupinaprav(this);

		return uzivatel;
	}

	public tblUzivatel removeUzivatel(tblUzivatel uzivatel) {
		getUzivatels().remove(uzivatel);
		uzivatel.setSkupinaprav(null);

		return uzivatel;
	}

}