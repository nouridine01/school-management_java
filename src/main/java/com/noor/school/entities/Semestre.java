package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Semestre {
	@Id
	@GeneratedValue
	private long id;
	private int numero_semestre;
	private String code_semestre;
	private String libelle_semestre;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	@OneToMany(mappedBy="semestre")
	private Collection <UniteEnseignement> uniteEnseignements;
	
	
	@OneToMany(mappedBy="semestre")
	private Collection<Semaine> semaines;
	
	@ManyToOne
	private Filiere filiere;
	
	


	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Semestre(int numero_semestre, String code_semestre, String libelle_semestre) {
		super();
		this.numero_semestre = numero_semestre;
		this.code_semestre = code_semestre;
		this.libelle_semestre = libelle_semestre;
	}




	public Semestre(int numero_semestre, String code_semestre, String libelle_semestre, Date created_at,
			int created_by) {
		super();
		this.numero_semestre = numero_semestre;
		this.code_semestre = code_semestre;
		this.libelle_semestre = libelle_semestre;
		this.created_at = created_at;
		this.created_by = created_by;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public int getNumero_semestre() {
		return numero_semestre;
	}




	public void setNumero_semestre(int numero_semestre) {
		this.numero_semestre = numero_semestre;
	}




	public String getCode_semestre() {
		return code_semestre;
	}




	public void setCode_semestre(String code_semestre) {
		this.code_semestre = code_semestre;
	}




	public String getLibelle_semestre() {
		return libelle_semestre;
	}




	public void setLibelle_semestre(String libelle_semestre) {
		this.libelle_semestre = libelle_semestre;
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




	public Collection<UniteEnseignement> getUniteEnseignements() {
		return uniteEnseignements;
	}




	public void setUniteEnseignements(Collection<UniteEnseignement> uniteEnseignements) {
		this.uniteEnseignements = uniteEnseignements;
	}




	public Collection<Semaine> getSemaines() {
		return semaines;
	}




	public void setSemaines(Collection<Semaine> semaines) {
		this.semaines = semaines;
	}




	public Filiere getFiliere() {
		return filiere;
	}




	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
	
	
}
