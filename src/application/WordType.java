package application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word_type")
public class WordType {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "word_type")
	private String wordType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String wordType() {
		return wordType;
	}
	public void wordType(String wordType) {
		this.wordType = wordType;
	}
}
