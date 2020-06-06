package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Classe {
	@Id
	@GeneratedValue
	private long id_classe;
	private String libelle_classe;
	private Date created_at;
	private Date modified_at;
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Classe(String libelle_classe) {
		super();
		this.libelle_classe = libelle_classe;
	}



	public Classe(long id, String libelle, Date created_at, Date modified_at) {
		super();
		this.id_classe = id;
		this.libelle_classe = libelle;
		this.created_at = created_at;
		this.modified_at = modified_at;
	}

	public long getId() {
		return id_classe;
	}

	public void setId(long id) {
		this.id_classe = id;
	}

	public String getLibelle() {
		return libelle_classe;
	}

	public void setLibelle(String libelle) {
		this.libelle_classe = libelle;
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
