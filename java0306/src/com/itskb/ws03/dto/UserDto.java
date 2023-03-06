package com.itskb.ws03.dto;

public class UserDto {
	private String phone;
	private String email;
	private String name;
	private int userSeq;
	private boolean isSleep;

	public UserDto (int userSeq, String name, String email, String phone, boolean isSleep) {
		this.userSeq = userSeq;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isSleep = isSleep;
}
	public void setName() {
		this.name= name;
	}
	public void setEmail() {
		this.email = email;
	}
	public void setUserSeq() {
		this.userSeq = userSeq;
	}
	
	public void setIsSleep() {
		this.isSleep = isSleep;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getUserSeq() {
		return userSeq;
	}
	
	public boolean getIsSleep() {
		return isSleep;
	}
	
	public String toString() {
		return("Name="+name+"email="+email+"phone="+phone+"isSleep="+isSleep);
	}
	
	
}
