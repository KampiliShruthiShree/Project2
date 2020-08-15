package com.learner.schoolmngmntapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learner.schoolmngmntapi.domain.Student;
import com.learner.schoolmngmntapi.repositories.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveOrUpdate(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
}