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
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	
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
		this.libelle = libelle;
	}

	public Filiere(String libelle, Date created_at, int created_by, Departement departement) {
		super();
		this.libelle = libelle;
		this.created_at = created_at;
		this.created_by = created_by;
		this.departement = departement;
	}

	public Filiere(String libelle, Date created_at, int created_by) {
		super();
		this.libelle = libelle;
		this.created_at = created_at;
		this.created_by = created_by;
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
