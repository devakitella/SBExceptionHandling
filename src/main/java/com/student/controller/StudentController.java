package com.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentDetails;
import com.student.exception.StudentAlreadyExistsException;
import com.student.exception.StudentNotFoundException;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(value = "/insert")
	public String insertData(@RequestBody StudentDetails studentDetails) throws StudentAlreadyExistsException {
		studentService.insertData(studentDetails);
		return "Record is inserted with - " + studentDetails.getStudentId();
	}
	
	@GetMapping(value="/retrieveAll")
	public Iterable<StudentDetails> retrieveAllData() {
		return studentService.getAllData();
	}
	
	@GetMapping(value="/retrieveById/{sId}")
	public ResponseEntity<StudentDetails> retrieveById(@PathVariable("sId") Integer studentId) throws StudentNotFoundException {
		 return ResponseEntity.ok(studentService.getStudentById(studentId));
	}
}
