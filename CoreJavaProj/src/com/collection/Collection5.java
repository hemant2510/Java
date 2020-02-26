package com.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Collection5 {
	public static void main(String[] args) {
		HashMap<Employee,String> hm=new HashMap<Employee,String>();
		hm.put(new Employee(1,"Hemant"), "One");
		hm.put(new Employee(2,"Raj"),"Two");
		
		Iterator<Employee> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
		}
			
	}
}

class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
	}
}