package com.Multithreading;

public class Multithreading1 implements Runnable {
	
	Thread t1,t2;
	public Multithreading1() {
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t1.start();
		t2.start();
	}
	
	public static void main(String [] args) {
		new Multithreading1();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING")){
			for(int i=0;i<20;i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().contentEquals("PONG")) {
			for(int i=0;i<20;i++) {
			System.out.println("      PONG");
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

}
