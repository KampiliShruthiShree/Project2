package com.learner.schoolmngmntapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learner.schoolmngmntapi.domain.Subjects;
import com.learner.schoolmngmntapi.repositories.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public Subjects saveOrUpdate(Subjects subjects) {
		return subjectRepository.save(subjects);
	}

	public List<Subjects> findAll() {
		return subjectRepository.findAll();
	}

}
