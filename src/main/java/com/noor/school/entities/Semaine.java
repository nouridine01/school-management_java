package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Semaine {
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	private Date date_debut;
	private Date date_fin;
	private Date created_at;
	private Date modified_at;
	
	public Semaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Semaine(String libelle, Date date_debut, Date date_fin) {
		super();
		this.libelle = libelle;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
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

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
}
