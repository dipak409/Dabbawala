package com.dipak.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;


@Entity
public class Login {
	
	@Id
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private String role;
    
	public Login() {
		
	}

	public Login(String email, String name, String password, String phoneNumber, String role) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Login [email=" + email + ", name=" + name + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", role=" + role + "]";
	}

	
    
}
