package com.exceptions;

public class InsufficientBalanceException extends RuntimeException{
	private String message;
	public InsufficientBalanceException() {
		this.message="";
	}
	
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return "Account balance is insufficient :"+ message;
	}
}

