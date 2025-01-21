package com.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentDetails;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	public StudentDetails insertData(StudentDetails studentDetails) {
		return studentRepo.save(studentDetails);
	}
	
	public Iterable<StudentDetails> getAllData() {
		return studentRepo.findAll();
	}
		
	public StudentDetails getStudentById(Integer studentId) throws StudentNotFoundException {
		return studentRepo.findById(studentId).orElseThrow(() -> new StudentNotFoundException("No Student found with the given Id - " + studentId));
	}
}
