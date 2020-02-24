package com.Multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private int y=400;
	private int height=0;
	private int percent = 70;
	public WaterTankTemplate() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		//g.fillRect(150, 200, 200, 200);
		g.fillRect(150, y, 200, height);
		g.drawString(percent + "%", 380, 200);
	}
	

	public static void main(String[] args) {
		WaterTankTemplate waterTank = new WaterTankTemplate();
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement();
	}

	class WaterManagement implements Runnable {
		Thread t1,t2,t3;
		public WaterManagement() {
			t1= new Thread(this);
			t2= new Thread(this);
			t3=new Thread(this);
			t1.setName("OUTLET");
			t2.setName("INLET");
			t3.setName("CONTROLLER");
			t3.setDaemon(true);
			t1.start();
			t2.start();
			t3.start();	
		}
		public void run() {
			if(Thread.currentThread().getName().equals("OUTLET")) {
				while(true) {
					y = y + 7;
					height = height - 7;
					repaint();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			else if(Thread.currentThread().getName().equals("INLET")) {
				while(true) {
					y = y - 5;
					height = height + 5;
					repaint();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				while(true) {
					System.out.println(y);
					if(y<=210) {
						t2.suspend();
						t1.resume();
					}
					
					else {
						t1.suspend();
						t2.resume();
						
					}
				}
				
			}
		}
	}}