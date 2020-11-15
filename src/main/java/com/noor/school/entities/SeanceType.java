package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class SeanceType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle_type;
	private String code_type;
	
	@ManyToOne
	private User created_by;
	private Date created_at;
	
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	
	
	public SeanceType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SeanceType(String libelle_type, String code_type, User created_by, Date created_at, User modified_by,
			Date modified_at) {
		super();
		this.libelle_type = libelle_type;
		this.code_type = code_type;
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
	public String getLibelle_type() {
		return libelle_type;
	}
	public void setLibelle_type(String libelle_type) {
		this.libelle_type = libelle_type;
	}
	public String getCode_type() {
		return code_type;
	}
	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}
	public User getCreated_by() {
		return created_by;
	}
	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public User getModified_by() {
		return modified_by;
	}
	public void setModified_by(User modified_by) {
		this.modified_by = modified_by;
	}
	public Date getModified_at() {
		return modified_at;
	}
	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}
	
	
	
	
}
