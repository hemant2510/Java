package com.lambdaExpression;

import java.util.ArrayList;

public class Lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="h"; 
		ArrayList<String> ar=new ArrayList<String>();
		for(int i=0;i<40;i++) {
			ar.add(s);
			s=s+"h";
		}
		
		ar.removeIf(p -> p.length()%2==0);
		System.out.println(ar);
	}

}
