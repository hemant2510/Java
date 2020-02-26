package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet=new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person a, Person b) {
				if(a.getWeight()<b.getWeight()) {
					return -1;
				}
				
				else if(a.getWeight()>b.getWeight()) {
					return 1;
				}
				else {
					if(a.getHeight()<b.getHeight()) {
						return -1;
					}
					
					else if(a.getHeight()<b.getHeight()) {
						return 1;
					}
					else
						return 0;
				}
			}
		});
		treeSet.add(new Person("Hemant",60,5.6));
		treeSet.add(new Person("Raj",55,5.5));
		treeSet.add(new Person("Priyam",110,5.7));
		
		System.out.println(treeSet);
	}

}

class Person {
	private String name;
	private int weight;
	private double height;
	public Person() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Person(String name, int weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	

}
