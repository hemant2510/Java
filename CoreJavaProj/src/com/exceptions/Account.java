package com.exceptions;
class Account {
	static int balance=1000;
	
	public static void withdraw(int amount){
		if(amount>balance) {
			throw new InsufficientBalanceException("Amount = "+amount);
		}
	}
	
	public static void main(String args[]) {
		withdraw(1200);
	}
	

}
