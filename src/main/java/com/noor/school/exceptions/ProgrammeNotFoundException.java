package com.noor.school.exceptions;

public class ProgrammeNotFoundException extends RuntimeException {
	public ProgrammeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
