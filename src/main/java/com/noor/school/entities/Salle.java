package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Salle {
	@Id
	@GeneratedValue
	private long id;
	private String libelle_salle;
	private String code_salle;
	private String description;
	private String dimension;
	private String capacite;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	@OneToMany(mappedBy="salle")
	private Collection <Seance> seances;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String libelle_salle, String code_salle, String description, String dimension, String capacite,
			Date created_at, int created_by) {
		super();
		this.libelle_salle = libelle_salle;
		this.code_salle = code_salle;
		this.description = description;
		this.dimension = dimension;
		this.capacite = capacite;
		this.created_at = created_at;
		this.created_by = created_by;
	}

	public Salle(String libelle_salle, String code_salle, Date created_at, int created_by) {
		super();
		this.libelle_salle = libelle_salle;
		this.code_salle = code_salle;
		this.created_at = created_at;
		this.created_by = created_by;
	}

	public Salle(String libelle_salle, String code_salle) {
		super();
		this.libelle_salle = libelle_salle;
		this.code_salle = code_salle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle_salle() {
		return libelle_salle;
	}

	public void setLibelle_salle(String libelle_salle) {
		this.libelle_salle = libelle_salle;
	}

	public String getCode_salle() {
		return code_salle;
	}

	public void setCode_salle(String code_salle) {
		this.code_salle = code_salle;
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

}
