package com.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> supplier=()-> Math.max(10,11);
		System.out.println(supplier.get());
		
		Consumer<String> consumer=(String s)-> System.out.println(s);
		consumer.accept("Hemant");
		
		Predicate<String> predicate=(String s)-> !s.isEmpty();
		System.out.println(predicate.test("check"));
		
		Function<Integer,String> function=(Integer i)-> String.valueOf(i);
		System.out.println(function.apply(5));
	}

}
