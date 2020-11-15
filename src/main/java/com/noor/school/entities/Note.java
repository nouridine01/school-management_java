package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double note;
	private int coefficient = 1;
	private String commentaire;

	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	private Enseignant enseignant ;
	
	@ManyToOne
	private Module module ;	
	
	@ManyToOne
	private Etudiant etudiant ;
	
	@ManyToOne
	private Bulletin bulletin ;
	
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	public Note(double note, int coefficient, String commentaire, User created_by, Date created_at, User modified_by,
			Date modified_at, Enseignant enseignant, Module module, Etudiant etudiant, Bulletin bulletin) {
		super();
		this.note = note;
		this.coefficient = coefficient;
		this.commentaire = commentaire;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.enseignant = enseignant;
		this.module = module;
		this.etudiant = etudiant;
		this.bulletin = bulletin;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public double getNote() {
		return note;
	}


	public void setNote(double note) {
		this.note = note;
	}


	public int getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
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


	public Enseignant getEnseignant() {
		return enseignant;
	}


	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}


	public Module getModule() {
		return module;
	}


	public void setModule(Module module) {
		this.module = module;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Bulletin getBulletin() {
		return bulletin;
	}


	public void setBulletin(Bulletin bulletin) {
		this.bulletin = bulletin;
	}
		
}
