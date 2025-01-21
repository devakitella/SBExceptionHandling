package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> handleStudentNotFoundException(StudentNotFoundException studentException) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(studentException.getMessage());
	}
}
