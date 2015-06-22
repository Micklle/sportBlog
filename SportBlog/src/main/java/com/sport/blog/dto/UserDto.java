package com.sport.blog.dto;

public class UserDto {
	private String name;
	private String email;
	private String role;
	private String password;
	
	public UserDto(String name, String email, String role, String password) {
		super();
		this.name = name;
		this.email = email;
		this.role = role;
		this.password = password;
	}
	public UserDto() {	}
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}