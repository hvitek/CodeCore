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
public class Skupinaprav implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to Pravaxskupinaprav
	@OneToMany(mappedBy="skupinaprav")
	private List<Pravaxskupinaprav> pravaxskupinapravs;

	//bi-directional many-to-one association to Uzivatel
	@OneToMany(mappedBy="skupinaprav")
	private List<Uzivatel> uzivatels;

	public Skupinaprav() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pravaxskupinaprav> getPravaxskupinapravs() {
		return this.pravaxskupinapravs;
	}

	public void setPravaxskupinapravs(List<Pravaxskupinaprav> pravaxskupinapravs) {
		this.pravaxskupinapravs = pravaxskupinapravs;
	}

	public Pravaxskupinaprav addPravaxskupinaprav(Pravaxskupinaprav pravaxskupinaprav) {
		getPravaxskupinapravs().add(pravaxskupinaprav);
		pravaxskupinaprav.setSkupinaprav(this);

		return pravaxskupinaprav;
	}

	public Pravaxskupinaprav removePravaxskupinaprav(Pravaxskupinaprav pravaxskupinaprav) {
		getPravaxskupinapravs().remove(pravaxskupinaprav);
		pravaxskupinaprav.setSkupinaprav(null);

		return pravaxskupinaprav;
	}

	public List<Uzivatel> getUzivatels() {
		return this.uzivatels;
	}

	public void setUzivatels(List<Uzivatel> uzivatels) {
		this.uzivatels = uzivatels;
	}

	public Uzivatel addUzivatel(Uzivatel uzivatel) {
		getUzivatels().add(uzivatel);
		uzivatel.setSkupinaprav(this);

		return uzivatel;
	}

	public Uzivatel removeUzivatel(Uzivatel uzivatel) {
		getUzivatels().remove(uzivatel);
		uzivatel.setSkupinaprav(null);

		return uzivatel;
	}

}