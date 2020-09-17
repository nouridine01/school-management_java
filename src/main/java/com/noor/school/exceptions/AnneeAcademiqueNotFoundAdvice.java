package com.noor.school.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AnneeAcademiqueNotFoundAdvice {
  @ResponseBody
  @ExceptionHandler(AnneeAcademiqueNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String AnneeAcademiqueNotFoundHandler(AnneeAcademiqueNotFoundException ex) {
    return ex.getMessage();
  }
}
