package com.ocean.template.springmvc.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Test object.
 * @author arcticrain
 *
 */
@Entity
public class Test implements Serializable {
	
	/** serial id.*/
	private static final long serialVersionUID = 6171148542943236344L;
	/** id of this object.*/
	@Id
	private UUID id;
	/** test string 1.*/
	private String test1;
	/** test string 2.*/
	private String test2;
	
	/**
	 * Constructor. Utilized by hibernate.
	 */
	public Test() {
		
	}
	
	/**
	 * Constructor.
	 * @param test1 - test string 1.
	 * @param test2 - test string 2.
	 */
	public Test(String test1, String test2) {
		this.id = UUID.randomUUID();
		this.test1 = test1;
		this.test2 = test2;
	}

	/**
	 * Returns the test string 1.
	 * @return the test string 1.
	 */
	public String getTest1() {
		return test1;
	}

	/**
	 * Returns an 
	 * @return
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the id to the inputted value.
	 * @param id - what to set the id to.
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * Sets the test string 1 value to the inputted value.
	 * @param test1 - what to set the test string 1 to.
	 */
	public void setTest1(String test1) {
		this.test1 = test1;
	}

	/**
	 * Returns the test string 2.
	 * @return the test string 2.
	 */
	public String getTest2() {
		return test2;
	}

	/**
	 * Sets the test string 2 value to the inputted value.
	 * @param test2 - what to set the test string 2 to.
	 */
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	/**
	 * Assigns an ID to this object.
	 */
	public void assignID() {
		this.id = UUID.randomUUID();
	}
	
}
