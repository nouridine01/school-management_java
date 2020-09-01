package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Semaine {
	@Id
	@GeneratedValue
	private long id;
	private String libelle_semaine;
	private String code_semaine;
	private Date date_debut;
	private Date date_fin;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	
	@OneToMany(mappedBy="semaine")
	private Collection <Seance> seances;
	
	
	@ManyToOne
	private Semestre semestre;
	
	public Semaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Semaine(String code_semaine,String libelle_semaine, Date date_debut, Date date_fin, Date created_at, int created_by, Semestre semestre) {
		super();
		this.code_semaine = code_semaine;
		this.libelle_semaine = libelle_semaine;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.created_at = created_at;
		this.created_by = created_by;
		this.semestre = semestre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_semaine() {
		return libelle_semaine;
	}

	public void setLibelle_semaine(String libelle_semaine) {
		this.libelle_semaine = libelle_semaine;
	}

	public String getCode_semaine() {
		return code_semaine;
	}

	public void setCode_semaine(String code_semaine) {
		this.code_semaine = code_semaine;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
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

	public Collection<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	
}
