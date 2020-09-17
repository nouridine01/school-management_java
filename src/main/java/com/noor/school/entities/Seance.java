package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Seance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	private String description;
	private String heure_debut;
	private String heure_fin;
	
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	private Module module;
	
	@ManyToOne
	private Semaine semaine;
	
	@ManyToOne
	private Salle salle;
	
	@ManyToOne
	private Classe classe;
	
	@ManyToOne
	private Enseignant enseignant;
	
	@OneToMany(mappedBy = "seance")
	private Collection<Absence> absences;
	
	@ManyToOne
	private Edt edt;

	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seance(String libelle, String description, String heure_debut, String heure_fin, Date created_at,
			User created_by, Module module, Semaine semaine, Salle salle, Classe classe, Enseignant enseignant) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.heure_debut = heure_debut;
		this.heure_fin = heure_fin;
		this.created_at = created_at;
		this.created_by = created_by;
		this.module = module;
		this.semaine = semaine;
		this.salle = salle;
		this.classe = classe;
		this.enseignant = enseignant;
	}

	public Seance(String libelle, String description, String heure_debut, String heure_fin, Module module,
			Classe classe) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.heure_debut = heure_debut;
		this.heure_fin = heure_fin;
		this.module = module;
		this.classe = classe;
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

	public String getHeure_debut() {
		return heure_debut;
	}

	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}

	public String getHeure_fin() {
		return heure_fin;
	}

	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
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

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Semaine getSemaine() {
		return semaine;
	}

	public void setSemaine(Semaine semaine) {
		this.semaine = semaine;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Collection<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(Collection<Absence> absences) {
		this.absences = absences;
	}

	public Edt getEdt() {
		return edt;
	}

	public void setEdt(Edt edt) {
		this.edt = edt;
	}
	
}
