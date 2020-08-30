package com.noor.school.exceptions;

public class EnseignantNotFoundException extends RuntimeException {
	public EnseignantNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
