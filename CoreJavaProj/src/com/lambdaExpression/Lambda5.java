package com.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda5 {

	static StringBuilder s=new StringBuilder("");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StringBuilder> ar=new ArrayList<StringBuilder>();
		ar.add(new StringBuilder("Hemant"));
		ar.add(new StringBuilder("Raj"));
		Consumer<StringBuilder> consumer=(StringBuilder s1)->s=s.append(s1.charAt(0));
		check(ar,consumer);
		System.out.println(s);
	}
	
	public static void check(ArrayList<StringBuilder> ar,Consumer c) {
		for(StringBuilder a:ar) {
			c.accept(a);
		}
	}

}
