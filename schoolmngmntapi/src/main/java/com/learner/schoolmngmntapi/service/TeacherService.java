package com.learner.schoolmngmntapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learner.schoolmngmntapi.domain.Teachers;
import com.learner.schoolmngmntapi.repositories.TeacherRepository;
@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;

	public Teachers saveOrUpdate(Teachers teachers) {
		return teacherRepository.save(teachers);
	}

	public List<Teachers> findAll() {
		return teacherRepository.findAll();
	}

}
