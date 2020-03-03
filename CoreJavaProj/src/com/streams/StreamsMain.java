package com.streams;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class StreamsMain {
	
	static long max=0,max1=0;

	public static void main(String[] args) {
		// Assignment 1
		TestData.getAllFruits().stream().filter((Fruit f)->f.getCalories()<100).sorted(Comparator.comparing((Fruit f)->f.getCalories()).reversed()).forEach(System.out::println);
	
		//Assignment 2
		TestData.getAllFruits().stream().collect(groupingBy(Fruit::getColor)).forEach((e,value)->System.out.println(e+" "+value));
		
		//Assignment 3
		TestData.getAllFruits().stream().filter(f->f.getColor().equalsIgnoreCase("RED")).sorted(Comparator.comparing(Fruit::getCalories)).forEach(System.out::println);
		
		//Assignment 4
		//(Type-1)
		TestData.getAllNews().stream().collect(groupingBy(News::getNewsId,counting())).forEach((e,value)->{if(value>max) {max=value;max1=e;}});
		System.out.println(max1);
		
		//(Type -2)
		Optional<Entry<Integer, Long>> maxEntry=TestData.getAllNews().stream().collect(groupingBy(News::getNewsId,counting())).entrySet().stream().max((Entry<Integer,Long> e1, Entry<Integer,Long> e2) -> e1.getValue().compareTo(e2.getValue()));
		System.out.println(maxEntry.get().getKey());
		
		//Assignment-5
		long counter=TestData.getAllNews().stream().filter(f->f.getComment().contains(String.valueOf("budget"))).count();
		System.out.println(counter);
		
		//Assignment-6
		TestData.getAllNews().stream().collect(groupingBy(News::getCommentByUser,counting())).forEach((e,value)->System.out.println(e+" - "+value));;
		
		//Assignment-7
		TestData.getAllTransactions().stream().filter(f->f.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		
		//Assignment-8
		TestData.getAllTransactions().stream().map(Transaction::getTrader).map(Trader::getCity).distinct().forEach(System.out::println);
		
		//Assignment-9
		TestData.getAllTransactions().stream().map(Transaction::getTrader).filter(f->f.getCity().equals("Pune")).sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
		
		//Assignment-10
		String s=TestData.getAllTransactions().stream().map(Transaction::getTrader).map(Trader::getName).sorted().collect(joining(", "));
		System.out.println(s);
		
		//Assignment-11
		Optional<Trader> op=TestData.getAllTransactions().stream().map(Transaction::getTrader).filter(f->f.getCity().contentEquals("Indore")).findAny();
		System.out.println(op);
		
		//Assignment-12
		TestData.getAllTransactions().stream().filter((Transaction f)->f.getTrader().getCity().equals("Pune")).map(Transaction::getValue).forEach(System.out::println);
		
		//Assignment-13
		System.out.println((TestData.getAllTransactions().stream().map(Transaction::getValue).reduce(Integer::max)).get());
		
		//Assignment-14
		System.out.println((TestData.getAllTransactions().stream().map(Transaction::getValue).reduce(Integer::min)).get());
		
		//Assignment-15
		Optional<Map.Entry<String, Long>> maxEntry1=TestData.getAllNews().stream().collect(groupingBy(News::getPostedByUser,counting())).entrySet().stream().max(Comparator.comparing(Entry::getValue));
		System.out.println(maxEntry1.get().getKey());
	}

}
