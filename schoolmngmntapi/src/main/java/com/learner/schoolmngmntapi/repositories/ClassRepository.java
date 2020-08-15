package com.learner.schoolmngmntapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learner.schoolmngmntapi.domain.Classes;

public interface ClassRepository extends JpaRepository<Classes, Integer> {

}
