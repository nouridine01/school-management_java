package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
	@Id
	@GeneratedValue
	private long id;
	private long id_etudiant;
	private long id_enseigant;
	private long id_module;
	private String commentaire;
	private Date created_at;
	private Date modified_at;
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(long id_etudiant, long id_enseigant, long id_module, String commentaire) {
		super();
		this.id_etudiant = id_etudiant;
		this.id_enseigant = id_enseigant;
		this.id_module = id_module;
		this.commentaire = commentaire;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public long getId_enseigant() {
		return id_enseigant;
	}

	public void setId_enseigant(long id_enseigant) {
		this.id_enseigant = id_enseigant;
	}

	public long getId_module() {
		return id_module;
	}

	public void setId_module(long id_module) {
		this.id_module = id_module;
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

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
	
}
