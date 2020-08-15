package com.learner.schoolmngmntapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learner.schoolmngmntapi.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
