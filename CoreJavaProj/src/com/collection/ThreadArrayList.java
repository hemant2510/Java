package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadArrayList {
	
	public ThreadArrayList(Runnable r) {
		Thread t=new Thread(r);
		t.start();
	}
	//static ArrayList<Integer> list=new ArrayList<Integer>();
	//static CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<Integer>();
	static ConcurrentHashMap<Integer, String> list=new ConcurrentHashMap<Integer, String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				list.put(10,"2");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.put(20,"3");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.put(30,"4");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.put(40,"6");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				while(true) {
				// TODO Auto-generated method stub
				Iterator<Integer> itr=list.keySet().iterator();
				while(itr.hasNext()) {
			
					System.out.println(list.get(itr.next()));	
					list.put(50,"5");
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}

		};
		
		new ThreadArrayList(r);
		new ThreadArrayList(r1);
	}
}
