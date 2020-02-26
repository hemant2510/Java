package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		
		hs.add(5);
		hs.add(2);
		hs.add(11);
		
		lhs.add(5);
		lhs.add(2);
		lhs.add(11);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			int x=it.next();
			System.out.print(x+" ");
		}
		System.out.println();
		Iterator<Integer> itr=lhs.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			System.out.print(x+" ");
		}
	}

}
