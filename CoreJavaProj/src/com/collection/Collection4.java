package com.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Collection4 {

	public static void main(String[] args) {
		HashMap<DateCollection,String> hm=new HashMap<DateCollection,String>();
		
		hm.put(new DateCollection(10, 3, 1998),"Hemant");
		hm.put(new DateCollection(10, 3, 1997),"Raj");
		hm.put(new DateCollection(10, 4, 1999),"Priyam");
		
		Iterator<DateCollection> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
		}
	}

}

class DateCollection{
	private int day;
	private int month;
	private int year;
	
	public DateCollection(){
		this.day=10;
		this.month=3;
		this.year=1998;
	}
	
	public DateCollection(int day,int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void setDay(int day){
		this.day=day;
	}
	
	public void setMonth(int month){
		this.month=month;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public String toString(){
		return "Date ->"+ this.day+"-"+this.month+"-"+this.year;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 25;
	}
	@Override
	public boolean equals(Object obj) {
		if((this.day==((DateCollection)obj).day) && (this.month==((DateCollection)obj).month) && (this.year!=((DateCollection)obj).year)) {
			return true;
		}
		else
			return false;
	}
}
