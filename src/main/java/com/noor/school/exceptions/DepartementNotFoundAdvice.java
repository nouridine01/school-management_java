package com.noor.school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DepartementNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(DepartementNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String DepartementNotFoundHandler(DepartementNotFoundException ex) {
    return ex.getMessage();
  }
}
