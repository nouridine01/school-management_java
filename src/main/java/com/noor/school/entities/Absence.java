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
	private int created_by;
	private Date modified_at;
	private int modified_by;
	
	
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
	
	
	public Absence(long id, String motif, Date date_absence, long id_seance, long id_etudiant, Date created_at,
			int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.motif = motif;
		this.date_absence = date_absence;
		this.id_seance = id_seance;
		this.id_etudiant = id_etudiant;
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


	public int getModified_by() {
		return modified_by;
	}


	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}


	public int getCreated_by() {
		return created_by;
	}


	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	
}
