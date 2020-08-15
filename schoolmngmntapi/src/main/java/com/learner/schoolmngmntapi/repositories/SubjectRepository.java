package com.learner.schoolmngmntapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learner.schoolmngmntapi.domain.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects, Integer> {

}
