package com.noor.school.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Filiere implements Serializable {
	
	@Id
	@GeneratedValue
	private long id_filiere;
	private String libelle_filiere;
	private Date created_at;
	private Date modified_at;
	
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Filiere(String libelle_filiere) {
		super();
		this.libelle_filiere = libelle_filiere;
	}


	public Filiere(long id, String libelle, Date created_at, Date modified_at) {
		super();
		this.id_filiere = id;
		this.libelle_filiere = libelle;
		this.created_at = created_at;
		this.modified_at = modified_at;
	}

	public long getId() {
		return id_filiere;
	}

	public void setId(long id) {
		this.id_filiere = id;
	}
	
	public String getLibelle() {
		return libelle_filiere;
	}

	public void setLibelle(String libelle) {
		this.libelle_filiere = libelle;
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
