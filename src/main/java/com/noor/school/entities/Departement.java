package com.noor.school.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Departement implements Serializable {
	@Id
	@GeneratedValue
	private long id_departement;
	private String libelle_departement;
	private Date created_at;
	private Date modified_at;
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Departement(String libelle_departement) {
		super();
		this.libelle_departement = libelle_departement;
	}



	public Departement(long id, String libelle, Date created_at, Date modified_at) {
		super();
		this.id_departement = id;
		this.libelle_departement = libelle;
		this.created_at = created_at;
		this.modified_at = modified_at;
	}
	

	public long getId() {
		return id_departement;
	}

	public void setId(long id) {
		this.id_departement = id;
	}
	
	public String getLibelle() {
		return libelle_departement;
	}

	public void setLibelle(String libelle) {
		this.libelle_departement = libelle;
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
