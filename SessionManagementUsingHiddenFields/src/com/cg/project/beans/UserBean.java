package com.cg.project.beans;
public class UserBean {
	String movieName,firstName,lastName,fruitName;

	public UserBean(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserBean(String movieName, String firstName, String lastName, String fruitName) {
		super();
		this.movieName = movieName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fruitName = fruitName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	
}
