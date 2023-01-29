package com.saumya.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	private int testscore;

	public Student(long id, String name, int testscore) {

		this.id = id;
		this.name = name;
		this.testscore = testscore;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestscore() {
		return testscore;
	}

	public void setTestscore(int testscore) {
		this.testscore = testscore;
	}

}
