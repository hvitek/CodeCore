package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pravaxskupinaprav database table.
 * 
 */
@Entity
@NamedQuery(name="Pravaxskupinaprav.findAll", query="SELECT p FROM Pravaxskupinaprav p")
public class tblPravaXSkupinaPrav implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	//bi-directional many-to-one association to Prava
	@ManyToOne
	@JoinColumn(name="fk_prava")
	private tblPrava prava;

	
	//bi-directional many-to-one association to Skupinaprav
	@ManyToOne
	@JoinColumn(name="fk_skupinaprav")
	private tblSkupinaPrav skupinaprav;

	public tblPravaXSkupinaPrav() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public tblPrava getPrava() {
		return this.prava;
	}

	public void setPrava(tblPrava prava) {
		this.prava = prava;
	}

	public tblSkupinaPrav getSkupinaprav() {
		return this.skupinaprav;
	}

	public void setSkupinaprav(tblSkupinaPrav skupinaprav) {
		this.skupinaprav = skupinaprav;
	}

}