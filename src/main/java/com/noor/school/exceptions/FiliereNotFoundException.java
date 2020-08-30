package com.noor.school.exceptions;

public class FiliereNotFoundException extends RuntimeException {
	public FiliereNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
