package com.learner.schoolmngmntapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learner.schoolmngmntapi.domain.Classes;
import com.learner.schoolmngmntapi.service.ClassService;

@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classService;

	@PostMapping("/saveClass")
	public ResponseEntity<?> saveClass(Classes classes) {
		Classes clas = classService.saveOrUpdate(classes);
		return new ResponseEntity<Classes>(clas, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public List<Classes> findClasses() {
		return classService.findAll();
	}
}
