package com.Multithreading;

public class Anonymous {
	
	public Anonymous(Runnable r,boolean Daemon) {
		Thread t=new Thread(r);
		t.setDaemon(Daemon);
		t.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
					for(int i=0;i<20;i++) {
						System.out.println("PING");
						try {
							Thread.sleep(500);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				
			}
		};
		Runnable r1=new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				
					for(int i=0;i<20;i++) {
						System.out.println("      PONG");
						try {
							Thread.sleep(300);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				
					for(;;) {
						System.out.println("              TONG");
						try {
							Thread.sleep(300);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				
			}
		};
		
		new Anonymous(r,false);
		new Anonymous(r1,false);
		new Anonymous(r2,true);
		
	}
}

	
