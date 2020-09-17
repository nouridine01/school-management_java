package com.noor.school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProgrammeNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(ProgrammeNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String ProgrammeNotFoundHandler(ProgrammeNotFoundException ex) {
    return ex.getMessage();
  }
}