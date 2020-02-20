package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileHandling5 {
	
	public static void writeObject() throws IOException {
		File file=new File("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\abc.dat");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(new Account1("Hemant",1,10000.0,new Date(9)));
	}
	
	public static void readObject() throws IOException, ClassNotFoundException{
		File file=new File("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\abc.dat");
		FileInputStream fos=new FileInputStream(file);
		ObjectInputStream oos= new ObjectInputStream(fos);
		Account1 account=(Account1)oos.readObject();
		System.out.println("Account "+account);
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeObject();
		readObject();

	}

}
class Date implements Serializable{
	@Override
	public String toString() {
		return "Date [day=" + day + "]";
	}
	int day=10;
	public Date(int day) {
		this.day=day;
	}
}


class Account1 implements Serializable{
	@Override
	public String toString() {
		return "Account1 [name=" + name + ", acc_no=" + acc_no + ", balance=" + balance + ", date=" + date + "]";
	}
	transient private String name;
	private int acc_no;
	private double balance;
	Date date=new Date(15);
	public Account1(String name, int acc_no, double balance,Date date) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
		this.date=date;
	}
	
}