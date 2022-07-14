package com.usermanagement.bean;

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String university;
	
	public User() {
	}
	
//	Construster without id parameters
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.university = country;
	}
	
	
//	Construster with all parameters
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.university = country;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String country) {
		this.university = country;
	}
}

