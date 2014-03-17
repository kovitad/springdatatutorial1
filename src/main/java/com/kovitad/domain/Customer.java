package com.kovitad.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * @author JANLAKHONK
 * 
 * 
 * 
This Document Example :

{ 
  firstname : "Tony",
  lastname : "Carter",
  emailAddress : "tonycarter@kovitad.com" 
}
 * 
 *
 */

@Document(collection="customers")
public class Customer {
	
	@Field("firstname")
	private String firstName;
	
	@Field("lastname")
	private String lastName;
	
	@Indexed(unique=true)
	@Field("emailAddress")
	private String emailAddress;

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
