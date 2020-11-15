package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classe{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_classe;
	private String libelle_classe;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="classe")
	private Collection<Etudiant> etudiants;
	
	@OneToMany(mappedBy="classe")
	private Collection<Seance> seances;
	
	@ManyToOne
	private Filiere filiere;
	
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Classe(String libelle_classe, User created_by, Date created_at, User modified_by, Date modified_at,
			 Filiere filiere) {
		super();
		this.libelle_classe = libelle_classe;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.filiere = filiere;
	}



	public Classe(String libelle_classe) {
		super();
		this.libelle_classe = libelle_classe;
	}

	

	public long getId_classe() {
		return id_classe;
	}


	public void setId_classe(long id_classe) {
		this.id_classe = id_classe;
	}


	public String getLibelle_classe() {
		return libelle_classe;
	}


	public void setLibelle_classe(String libelle_classe) {
		this.libelle_classe = libelle_classe;
	}


	public Date getCreated_at() {
		return created_at;
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


	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}


	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}


	public Collection<Seance> getSeances() {
		return seances;
	}


	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}


	public Filiere getFiliere() {
		return filiere;
	}


	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
}
