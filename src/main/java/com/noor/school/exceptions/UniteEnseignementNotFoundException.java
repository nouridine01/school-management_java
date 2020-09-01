package com.noor.school.exceptions;

public class UniteEnseignementNotFoundException extends RuntimeException {
	public UniteEnseignementNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
