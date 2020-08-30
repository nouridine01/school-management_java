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
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Enseignant(String titre) {
		super();
		this.titre = titre;
	}
	
	
	public Enseignant(long id, String titre, Date created_at, int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.titre = titre;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
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

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}
	
	
	
}
