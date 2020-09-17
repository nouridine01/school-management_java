package com.noor.school.exceptions;

public class NoteNotFoundException extends RuntimeException {
	public NoteNotFoundException(Long id) {
	    super("Could not find note " + id);
	  }
}
