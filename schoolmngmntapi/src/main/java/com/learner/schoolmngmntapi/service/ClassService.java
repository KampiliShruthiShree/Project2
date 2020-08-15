package com.learner.schoolmngmntapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learner.schoolmngmntapi.repositories.ClassRepository;
import com.learner.schoolmngmntapi.domain.Classes;

@Service
public class ClassService {

	@Autowired
	private ClassRepository classRepository;

	public Classes saveOrUpdate(Classes classes) {
		return classRepository.save(classes);
	}

	public List<Classes> findAll() {
		return classRepository.findAll();
	}
}
