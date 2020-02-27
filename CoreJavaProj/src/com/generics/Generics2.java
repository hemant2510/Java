package com.generics;

import java.util.ArrayList;

public class Generics2 {

	public static void print(ArrayList<? extends Number> ar) {
		System.out.print(ar);
	}
	
	static ArrayList<Number> ar=new ArrayList<Number>();
	static ArrayList<Double> ar2=new ArrayList<Double>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar2.add(40.0);
		ar2.add(50.0);
		print(ar);
		print(ar2);

	}

}
