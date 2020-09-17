package com.noor.school.exceptions;

public class ClasseNotFoundException extends RuntimeException {
	public ClasseNotFoundException(Long id) {
	    super("Could not find classe " + id);
	  }
}
