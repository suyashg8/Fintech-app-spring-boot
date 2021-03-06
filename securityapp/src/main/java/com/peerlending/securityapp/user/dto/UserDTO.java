package com.peerlending.securityapp.user.dto;



public class UserDTO {

	 private String username;
	 private String password;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private String occupation;
	 private Balance balance;
	 

	 public UserDTO() {
			 
		 }
		 
	 

	 
	public UserDTO(String username, String password, String firstName, String lastName, int age, String occupation,
			Balance balance) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.occupation = occupation;
		this.balance = balance;
	}



	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Balance getBalance() {
		return balance;
	}
	 
	 
	 
}