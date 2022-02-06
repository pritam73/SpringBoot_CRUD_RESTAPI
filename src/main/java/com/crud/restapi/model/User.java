package com.crud.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "Name must not be null")
	private String name;
	@NotEmpty(message = "Email must not be null")
	private String email;
	private String mobNo;
	private String password;

	public User() {
	}

	public User(long id, @NotEmpty(message = "Name must not be null") String name,
			@NotEmpty(message = "Email must not be null") String email, String mobNo, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
