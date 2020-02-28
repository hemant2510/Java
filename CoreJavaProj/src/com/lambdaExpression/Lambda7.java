package com.lambdaExpression;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Lambda7 {

	static StringBuilder s2=new StringBuilder();
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
        hash_map.put(10, "Hemant"); 
        hash_map.put(15, "Raj"); 
        hash_map.put(20, "Shagun"); 
        hash_map.put(25, "Singh"); 
        
        Set<Map.Entry<Integer, String>> s=hash_map.entrySet();
        Consumer<String> consumerString=(String s1)->s2.append(s1+" ");
        check(s,consumerString);
        System.out.println(s2);
	}
	
	public static void check(Set<Map.Entry<Integer, String>> s,Consumer<String> c1) {
		for(Map.Entry<Integer, String> s1:s) {
			c1.accept(String.valueOf(s1.getKey()));
			c1.accept(String.valueOf(s1.getValue()));
		}
	}

}
