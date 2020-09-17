package com.noor.school.exceptions;

public class SeanceNotFoundException extends RuntimeException {
	public SeanceNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
