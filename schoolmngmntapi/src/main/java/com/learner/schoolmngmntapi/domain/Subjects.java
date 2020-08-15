package com.learner.schoolmngmntapi.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table

public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tid")
	@JsonBackReference
	private Teachers teacher;

	public Subjects() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subjects(String name) {
		super();
		this.name = name;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}

}
