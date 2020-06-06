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
	
}
