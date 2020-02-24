package com.Multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGame extends Frame implements Runnable {
	
	Thread t1,t2,t3;
	static int y1 = 400, y2 = 400, y3 = 400;
	public OvalGame() {
		super("Oval game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("One")){
		int count=0;
		while(true) {
			if(y1>=100) {
				y1=y1-30;
				repaint();
				count++;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			else if(y1<100) {
				while(count!=0) {
				y1=y1+30;
				this.repaint();
				count--;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}		
		}
		}
		
		if(currentThread.getName().equals("Two")){
			int count=0;
			while(true) {
				if(y2>=100) {
					y2=y2-20;
					this.repaint();
					count++;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				else if(y2<100) {
					while(count!=0) {
					y2=y2+20;
					this.repaint();
					count--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}		
			}
		}
		
		if(currentThread.getName().equals("Three")){
			int count=0;
			while(true) {
				if(y3>=100) {
					y3=y3-50;
					this.repaint();
					count++;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				else if(y3<100) {
					while(count!=0) {
					y3=y3+50;
					this.repaint();
					count--;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}		
			}
		}
	}
		
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}
