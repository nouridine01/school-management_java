package com.noor.school.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Filiere implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_filiere;
	private String libelle;
	private Date created_at;
	
	@ManyToOne
	private User created_by;
	
	private Date modified_at;
	@ManyToOne
	private User modified_by;
	
	
	@ManyToOne
	private Departement departement;
	
	
	@OneToMany(mappedBy="filiere")
	private Collection <Semestre> semestres;
	
	@OneToMany(mappedBy="filiere")
	private Collection<Classe> classes;
	
	@OneToOne(fetch=FetchType.LAZY, mappedBy="filiere")
	private Programme programme;
	
	public Programme getProgramme() {
		return programme;
	}

	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
	public Filiere(String libelle) {
		super();
	}

	
	

	public Filiere(String libelle, Date created_at, User created_by, Date modified_at, User modified_by,
			Departement departement,Programme programme) {
		super();
		this.libelle = libelle;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
		this.departement = departement;
		this.programme = programme;
	}

	public long getId_filiere() {
		return id_filiere;
	}

	public void setId_filiere(long id_filiere) {
		this.id_filiere = id_filiere;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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

	
	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public User getModified_by() {
		return modified_by;
	}

	public void setModified_by(User modified_by) {
		this.modified_by = modified_by;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Collection<Semestre> getSemestres() {
		return semestres;
	}

	public void setSemestres(Collection<Semestre> semestres) {
		this.semestres = semestres;
	}

	public Collection<Classe> getClasses() {
		return classes;
	}

	public void setClasses(Collection<Classe> classes) {
		this.classes = classes;
	}
	
}
