package com.ocean.nuhuh.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test implements Serializable {
	
	/** serial id.*/
	private static final long serialVersionUID = 6171148542943236344L;
	@Id
	private UUID id;
	private String test1;
	private String test2;
	
	public Test() {
		
	}
	
	public Test(String test1, String test2) {
		this.id = UUID.randomUUID();
		this.test1 = test1;
		this.test2 = test2;
	}

	public String getTest1() {
		return test1;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	public void assignID() {
		this.id = UUID.randomUUID();
	}
	
}
