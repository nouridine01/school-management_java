package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Salle {
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	private String description;
	private String dimension;
	private String capacite;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String libelle, String description, String dimension, String capacite) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.dimension = dimension;
		this.capacite = capacite;
	}

	public Salle(long id, String libelle, String description, String dimension, String capacite, Date created_at,
			int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.dimension = dimension;
		this.capacite = capacite;
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

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
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
