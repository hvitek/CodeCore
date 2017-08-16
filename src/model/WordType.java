package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the word_type database table.
 * 
 */
@Entity
@Table(name="word_type")
@NamedQuery(name="WordType.findAll", query="SELECT w FROM WordType w")
public class WordType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="word_type")
	private String wordType;

	public WordType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWordType() {
		return this.wordType;
	}

	public void setWordType(String wordType) {
		this.wordType = wordType;
	}

}