package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String libelle_salle;
	@NotNull
	private String code_salle;
	private String description;
	private String dimension;
	private String capacite;

	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="salle")
	private Collection <Seance> seances;
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(String libelle_salle, String code_salle, String description, String dimension, String capacite) {
		super();
		this.libelle_salle = libelle_salle;
		this.code_salle = code_salle;
		this.description = description;
		this.dimension = dimension;
		this.capacite = capacite;
	}

	

	public Salle(String libelle_salle, String code_salle, String description, String dimension, String capacite,
			User created_by, Date created_at, User modified_by, Date modified_at) {
		super();
		this.libelle_salle = libelle_salle;
		this.code_salle = code_salle;
		this.description = description;
		this.dimension = dimension;
		this.capacite = capacite;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
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

	public Collection<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}

}
