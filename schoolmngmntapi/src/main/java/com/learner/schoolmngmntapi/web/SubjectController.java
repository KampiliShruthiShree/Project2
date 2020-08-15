package com.learner.schoolmngmntapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learner.schoolmngmntapi.domain.Subjects;
import com.learner.schoolmngmntapi.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/saveSubject")
	public ResponseEntity<?> saveSubject(Subjects subject){
		Subjects subj = subjectService.saveOrUpdate(subject);
		return new ResponseEntity<Subjects>(subj,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Subjects> findSubjects(){
		return subjectService.findAll();
	}
}
