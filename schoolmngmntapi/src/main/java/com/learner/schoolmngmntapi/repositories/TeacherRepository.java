package com.learner.schoolmngmntapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learner.schoolmngmntapi.domain.Teachers;

public interface TeacherRepository extends JpaRepository<Teachers, Integer> {

}
