package com.noor.school.exceptions;

public class ScolariteNotFoundException extends RuntimeException {
	public ScolariteNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
