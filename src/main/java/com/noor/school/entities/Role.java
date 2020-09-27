package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;
    @ManyToOne
	private User created_by;
	private Date created_at;
	@ManyToOne
	private User modified_by;
	private Date modified_at;
	
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Role(long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
	
	
	public Role(long id, String role, User created_by, User modified_by) {
		super();
		this.id = id;
		this.role = role;
		this.created_by = created_by;
		this.modified_by = modified_by;
	}



	public Role(long id, String role, User created_by, Date created_at, User modified_by, Date modified_at) {
		super();
		this.id = id;
		this.role = role;
		this.created_by = created_by;
		this.created_at = created_at;
		this.modified_by = modified_by;
		this.modified_at = modified_at;
	}



	//getters
    public long getId(){
        return this.id;
    }

    public String getRole(){
        return this.role;
    }
    
    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setRole(String role){
        this.role=role;
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

}