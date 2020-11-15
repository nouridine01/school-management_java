package com.noor.school.entities;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_departement;
	private String codeDepartement;
	private String libelleDepartement;

	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="departement")
	private Collection <Filiere> filieres;
	
	@OneToMany(mappedBy="departement")
	private Collection <Personnel> personnels;
	
	
	
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Departement(String codeDepartement, String libelleDepartement, User created_by, Date created_at,
			User modified_by, Date modified_at) {
		super();
		this.codeDepartement = codeDepartement;
		this.libelleDepartement = libelleDepartement;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		
	}

	public Departement(String libelle_departement) {
		super();
		this.libelleDepartement = libelle_departement;
	}


	public long getId_departement() {
		return id_departement;
	}

	public void setId_departement(long id_departement) {
		this.id_departement = id_departement;
	}

	public String getLibelle_departement() {
		return libelleDepartement;
	}

	public void setLibelle_departement(String libelle_departement) {
		this.libelleDepartement = libelle_departement;
	}

	public Date getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public User getModified_by() {
		return modified_by;
	}

	public void setModified_by(User modified_by) {
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
