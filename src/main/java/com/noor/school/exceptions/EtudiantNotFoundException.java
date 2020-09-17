package com.noor.school.exceptions;

public class EtudiantNotFoundException extends RuntimeException {
	public EtudiantNotFoundException(Long id) {
	    super("Could not find étudiant " + id);
	  }
}
