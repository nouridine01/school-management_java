package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Seance {
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	private String description;
	private String heure_debut;
	private String heure_fin;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Seance(String libelle, String description, String heure_debut, String heure_fin) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.heure_debut = heure_debut;
		this.heure_fin = heure_fin;
	}
	
	public Seance(long id, String libelle, String description, String heure_debut, String heure_fin, Date created_at,
			int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.heure_debut = heure_debut;
		this.heure_fin = heure_fin;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getHeure_debut() {
		return heure_debut;
	}
	
	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}
	
	public String getHeure_fin() {
		return heure_fin;
	}
	
	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
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
