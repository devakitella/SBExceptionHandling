package com.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentDetails;

@Repository
public interface StudentRepo extends CrudRepository<StudentDetails, Integer>{

}
