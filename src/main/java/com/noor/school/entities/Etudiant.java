package com.noor.school.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.validation.constraints.Pattern;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String matricule;
	private String nom;
	private String prenom;
	private String telephone;
	
	/*@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	             message="{invalid.email}")*/
	private String email;
	private String titre;
	private String diplome;
	private Date date_naissance;
	@ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	@ManyToOne
	@JoinColumn(name="classe_id_classe")
	private Classe classe;
	
	@OneToMany(mappedBy="etudiant")
	private Collection<Absence> absences;
	
	@OneToMany(mappedBy="etudiant")
	private Collection<Note> notes;
	
	@ManyToOne
	private Scolarite scolarite;
	
	@OneToMany(mappedBy="etudiant")
	private Collection<Bulletin> bulletins;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String matricule, String nom, String prenom, String telephone, String email, String titre,
			String diplome, Date date_naissance,Classe classe) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
		this.classe = classe;
	}
	
	
	
	

	public Etudiant(String matricule, String nom, String prenom, String telephone, String email, String titre,
			String diplome, Date date_naissance, User created_by, Date created_at, Classe classe, Scolarite scolarite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
		this.created_by = created_by;
		this.created_at = created_at;
		this.classe = classe;
		this.scolarite = scolarite;
	}

	
	
	
	
	
	

	public Etudiant(String matricule, String nom, String prenom, String telephone, String email, String titre,
			String diplome, Date date_naissance, User created_by, Date created_at, User modified_by, Date modified_at,
			Classe classe,Scolarite scolarite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.titre = titre;
		this.diplome = diplome;
		this.date_naissance = date_naissance;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
		this.classe = classe;
		this.scolarite = scolarite;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
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

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Collection<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(Collection<Absence> absences) {
		this.absences = absences;
	}

	public Collection<Note> getNotes() {
		return notes;
	}

	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}
	
}
