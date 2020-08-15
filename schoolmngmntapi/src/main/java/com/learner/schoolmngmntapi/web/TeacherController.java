package com.learner.schoolmngmntapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learner.schoolmngmntapi.domain.Teachers;
import com.learner.schoolmngmntapi.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/saveTeacher")
	public ResponseEntity<?> saveTeacher(Teachers teacher){
		Teachers teachr = teacherService.saveOrUpdate(teacher);
		return new ResponseEntity<Teachers>(teachr,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Teachers> findTeachers(){
		return teacherService.findAll();
	}

}
