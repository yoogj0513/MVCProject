package com.yi.model;

public class GuestBook {
	// db 컬럼 이름, 타입 맞춰주면 됨
	private int id;
	private String name;
	private String password;
	private String message;
	
	public GuestBook() {
		super();
	}
	
	public GuestBook(int id, String name, String password, String message) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.message = message;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("GuestBook [id=%s, name=%s, password=%s, message=%s]", id, name, password, message);
	}

}
