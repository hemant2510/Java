package com.collection;

import java.util.*;
import java.util.ArrayList;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(19);
		list.add(98);
		
		ListIterator<Integer> li= list.listIterator(list.size());
		while(li.hasPrevious()) {
			int x=li.previous();
			System.out.print(x+" ");
		}
		

	}

}
