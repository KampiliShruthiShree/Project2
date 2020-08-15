package com.learner.schoolmngmntapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learner.schoolmngmntapi.domain.Student;
import com.learner.schoolmngmntapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(Student student){
		Student stud = studentService.saveOrUpdate(student);
		return new ResponseEntity<Student>(stud,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Student> findStudents(){
		return studentService.findAll();
	}
}
