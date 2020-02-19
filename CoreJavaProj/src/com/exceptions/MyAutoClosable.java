package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyAutoClosable implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("MyAutocloseable closed!");
	}
	
	public static void main(String []args) throws Exception{
		try(MyAutoClosable input = new MyAutoClosable()) {
			System.out.println("Inside try");
			int x=25/0;
			System.out.println("Yes");	
			}
		catch(ArithmeticException e){
		}
	}	
}