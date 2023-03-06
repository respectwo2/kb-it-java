package com.itskb.ws03.dto;

public class AccountDto {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;

	public AccountDto (int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}
	public void setAccountSeq() {
		this.accountSeq = accountSeq;
	}
	public void setAccountNumber() {
		this.accountNumber = accountNumber;
	}
	public void setBalance() {
		this.balance = balance;
	}
	public void setUserSeq() {
		this.userSeq = userSeq;
	}
	
	
	public int getAccountSeq() {
		return accountSeq;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public int getUserSeq() {
		return userSeq;
	}
	
	
	public String toString() {
		return("accountSeq="+accountSeq+"accountNumber="+accountNumber+"balance="+balance+"userSeq="+userSeq);
	}
	
}