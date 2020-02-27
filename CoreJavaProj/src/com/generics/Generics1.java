package com.generics;

public class Generics1<T> {
	
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics1<String> generics1=new Generics1<String>();
		generics1.set("45");
		String s=generics1.get();
		System.out.println(s);

	}

}
