package com.noor.school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EnseignantNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(EnseignantNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String EnseignantNotFoundHandler(EnseignantNotFoundException ex) {
    return ex.getMessage();
  }
}
