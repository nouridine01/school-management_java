package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enseignant extends Personnel {
	@Id
	@GeneratedValue
	private long id;
	private String titre;
	private Date created_at;
	private Date modified_at;
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Enseignant(String titre) {
		super();
		this.titre = titre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
	
	
}
