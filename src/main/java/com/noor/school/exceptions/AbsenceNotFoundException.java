package com.noor.school.exceptions;

public class AbsenceNotFoundException extends RuntimeException {
	public AbsenceNotFoundException(Long id) {
	    super("Could not find absence " + id);
	  }
}
