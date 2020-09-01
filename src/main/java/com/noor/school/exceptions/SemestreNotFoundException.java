package com.noor.school.exceptions;

public class SemestreNotFoundException extends RuntimeException {
	public SemestreNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
