package com.generics;

import java.util.HashMap;
import java.util.Iterator;

public class Generics3 {

	public static void printMapKeyValues(HashMap<? extends Number,?> hmap) {
		Iterator<? extends Number> itr=hmap.keySet().iterator();
		while(itr.hasNext()) {
			Number x=itr.next();
			System.out.print("Key : "+x+" ");
			System.out.print("Value : "+hmap.get(x)+" ");
			System.out.println();
			
		}
	}
	static HashMap<Integer,String> hmap=new HashMap<Integer,String>();
	static HashMap<Double,String> hmap2=new HashMap<Double,String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hmap.put(1,"One");
		hmap.put(2, "Two");
		hmap2.put(1.0,"First");
		hmap2.put(2.0,"Second");
		
		printMapKeyValues(hmap);
		printMapKeyValues(hmap2);
	}

}
