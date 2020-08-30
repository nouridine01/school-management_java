package com.noor.school.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;
	private Date created_at;
	private int created_by;
	private Date modified_at;
	private int modified_by;

	
    
    public Role(long id, String role, Date created_at, int created_by, Date modified_at, int modified_by) {
		super();
		this.id = id;
		this.role = role;
		this.created_at = created_at;
		this.created_by = created_by;
		this.modified_at = modified_at;
		this.modified_by = modified_by;
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

}