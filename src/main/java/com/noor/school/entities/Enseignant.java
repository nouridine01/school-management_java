package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titre_enseignant;
	private String code_enseignant;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@OneToMany(mappedBy="enseignant")
	private Collection<Note> notes;
	
	@OneToMany(mappedBy="enseignant")
	private Collection<Seance> seances;
	
	@ManyToOne
	private Personnel personnel;
	
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(Personnel personnel, String code_enseignant, String titre, Date created_at, User created_by) {
		super();
		this.personnel = personnel;
		this.code_enseignant = code_enseignant;
		this.titre_enseignant = titre;
		this.created_at = created_at;
		this.created_by = created_by;
		
	}

	
	

	public Enseignant(String titre_enseignant, String code_enseignant, User created_by, Date created_at,
			User modified_by, Date modified_at,
			Personnel personnel) {
		super();
		this.titre_enseignant = titre_enseignant;
		this.code_enseignant = code_enseignant;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.personnel = personnel;
	}

	public String getTitre_enseignant() {
		return titre_enseignant;
	}

	public void setTitre_enseignant(String titre_enseignant) {
		this.titre_enseignant = titre_enseignant;
	}

	public String getCode_enseignant() {
		return code_enseignant;
	}

	public void setCode_enseignant(String code_enseignant) {
		this.code_enseignant = code_enseignant;
	}

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}

	public Enseignant(String titre) {
		super();
		this.titre_enseignant = titre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre_enseignant;
	}

	public void setTitre(String titre) {
		this.titre_enseignant = titre;
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

	public Collection<Note> getNotes() {
		return notes;
	}

	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}

	public Collection<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Collection<Seance> seances) {
		this.seances = seances;
	}
	
	
	
}
