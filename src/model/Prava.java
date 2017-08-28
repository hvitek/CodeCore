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
public class Prava implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nazev;

	//bi-directional many-to-one association to Wf
	@ManyToOne
	@JoinColumn(name="wf")
	private Wf wfBean;

	//bi-directional many-to-one association to Pravaxskupinaprav
	@OneToMany(mappedBy="prava")
	private List<Pravaxskupinaprav> pravaxskupinapravs;

	public Prava() {
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

	public Wf getWfBean() {
		return this.wfBean;
	}

	public void setWfBean(Wf wfBean) {
		this.wfBean = wfBean;
	}

	public List<Pravaxskupinaprav> getPravaxskupinapravs() {
		return this.pravaxskupinapravs;
	}

	public void setPravaxskupinapravs(List<Pravaxskupinaprav> pravaxskupinapravs) {
		this.pravaxskupinapravs = pravaxskupinapravs;
	}

	public Pravaxskupinaprav addPravaxskupinaprav(Pravaxskupinaprav pravaxskupinaprav) {
		getPravaxskupinapravs().add(pravaxskupinaprav);
		pravaxskupinaprav.setPrava(this);

		return pravaxskupinaprav;
	}

	public Pravaxskupinaprav removePravaxskupinaprav(Pravaxskupinaprav pravaxskupinaprav) {
		getPravaxskupinapravs().remove(pravaxskupinaprav);
		pravaxskupinaprav.setPrava(null);

		return pravaxskupinaprav;
	}

}