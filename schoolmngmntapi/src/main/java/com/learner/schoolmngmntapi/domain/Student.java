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
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "cid")
	private Classes classes;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return name;
	}

	public void setStudentname(String studentname) {
		this.name = studentname;
	}

	public Student(String studentname) {
		super();
		this.name = studentname;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", studentname=" + name + "]";
	}

}