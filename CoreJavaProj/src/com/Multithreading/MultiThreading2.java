package com.Multithreading;

public class MultiThreading2 extends Thread {

	public MultiThreading2(String name) {
		super.setName(name);
		super.start();
		
	}
	
	public static void main(String [] args) {
		new MultiThreading2("PING");
		new MultiThreading2("PONG");	
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
