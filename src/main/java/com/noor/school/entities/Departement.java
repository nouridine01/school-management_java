package com.noor.school.entities;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="departement")
	private Collection <Filiere> filieres;
	
	@OneToMany(mappedBy="departement")
	private Collection <Personnel> personnels;
	
	
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Departement(String libelle_departement) {
		super();
		this.libelle_departement = libelle_departement;
	}



	public Departement(String libelle, Date created_at, Date modified_at) {
		super();
		this.libelle_departement = libelle;
		this.created_at = created_at;
		this.modified_at = modified_at;
	}

	public long getId_departement() {
		return id_departement;
	}

	public void setId_departement(long id_departement) {
		this.id_departement = id_departement;
	}

	public String getLibelle_departement() {
		return libelle_departement;
	}

	public void setLibelle_departement(String libelle_departement) {
		this.libelle_departement = libelle_departement;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}

	public Collection<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(Collection<Filiere> filieres) {
		this.filieres = filieres;
	}

	public Collection<Personnel> getPersonnels() {
		return personnels;
	}

	public void setPersonnels(Collection<Personnel> personnels) {
		this.personnels = personnels;
	}
	
}
