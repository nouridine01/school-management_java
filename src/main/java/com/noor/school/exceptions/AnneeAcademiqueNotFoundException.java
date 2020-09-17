package com.noor.school.exceptions;

public class AnneeAcademiqueNotFoundException extends RuntimeException {
	public AnneeAcademiqueNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
