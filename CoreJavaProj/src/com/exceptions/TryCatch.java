package com.exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int z=5/1;
			try {
			int arr[]=new int[5];
			arr[6]=7;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Done");
		}

	}
}
