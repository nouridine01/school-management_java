package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
	@Id
	@GeneratedValue
	private long id;
	private String motif;
	private Date date_absence;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	@ManyToOne
	private Etudiant etudiant;
	
	@ManyToOne
	private Seance seance;
	
	
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Absence(String motif, Date date_absence, Date created_at, int created_by, Etudiant etudiant, Seance seance) {
		super();
		this.motif = motif;
		this.date_absence = date_absence;
		this.created_at = created_at;
		this.created_by = created_by;
		this.etudiant = etudiant;
		this.seance = seance;
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


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Seance getSeance() {
		return seance;
	}


	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	
	
}
