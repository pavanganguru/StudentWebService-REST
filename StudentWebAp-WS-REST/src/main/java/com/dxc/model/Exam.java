package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exam {
	@Id
	private String id;
	private String name;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + "]";
	}

}