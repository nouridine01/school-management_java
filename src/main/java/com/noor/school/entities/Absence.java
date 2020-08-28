package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Absence {
	@Id
	@GeneratedValue
	private long id;
	private String motif;
	private Date date_absence;
	private long id_seance;
	private long id_etudiant;
	private Date created_at;
	private Date modified_at;
	
	
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Absence(String motif, Date date_absence, long id_seance, long id_etudiant) {
		super();
		this.motif = motif;
		this.date_absence = date_absence;
		this.id_seance = id_seance;
		this.id_etudiant = id_etudiant;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getMotif() {
		return motif;
	}


	public void setMotif(String motif) {
		this.motif = motif;
	}


	public Date getDate_absence() {
		return date_absence;
	}


	public void setDate_absence(Date date_absence) {
		this.date_absence = date_absence;
	}


	public long getId_seance() {
		return id_seance;
	}


	public void setId_seance(long id_seance) {
		this.id_seance = id_seance;
	}


	public long getId_etudiant() {
		return id_etudiant;
	}


	public void setId_etudiant(long id_etudiant) {
		this.id_etudiant = id_etudiant;
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
