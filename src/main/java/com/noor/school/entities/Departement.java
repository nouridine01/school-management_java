package com.noor.school.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Departement {
	@Id
	@GeneratedValue
	private long id_departement;
	private String libelle_departement;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
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
	
	
	public Departement(long id_departement, String libelle_departement, Date created_at, int created_by,
			Date modified_at, int modified_by) {
		super();
		this.id_departement = id_departement;
		this.libelle_departement = libelle_departement;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
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
