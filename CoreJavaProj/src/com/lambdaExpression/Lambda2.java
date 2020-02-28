package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

class Order {
	private String status;
	private int price;
	
	public Order() {}

	public Order(String status, int price) {
		this.status = status;
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return status + " - " + price;
	}
}

public class Lambda2 {
	public static void printOrder(ArrayList<Order> orderList,Consumer<Order> consumer) {
		for(Order order: orderList) {
			consumer.accept(order);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order> orderList = new ArrayList<Order>();
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String status = i%2==0 ? "ACCEPTED" : "COMPLETED";
			int price = random.nextInt(20000);
			Order order = new Order(status, price);
			orderList.add(order);
		}
		
		Consumer<Order> consumer=(Order order)-> {
			if(order.getPrice()>10000 && order.getStatus()=="ACCEPTED") {
				System.out.println(order);
			}
		};
		printOrder(orderList,consumer);
		
	}

}
