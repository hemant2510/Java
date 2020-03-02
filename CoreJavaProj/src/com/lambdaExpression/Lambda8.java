package com.lambdaExpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Lambda8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		Consumer<Integer> c=(Integer i)->System.out.println(i);
				Runnable r=()->{
					for(int i=0;i<ar.size();i++)
					{
						c.accept(ar.get(i));
					}
				};
		Thread t=new Thread(r);
		t.start();
	}

}
