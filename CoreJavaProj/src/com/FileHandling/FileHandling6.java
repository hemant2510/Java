package com.FileHandling;

import java.io.*;

class Accounts{
	private String name;
	private int acc_no;
	private double balance;
	public Accounts(String name, int acc_no, double balance) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Accounts [name=" + name + ", acc_no=" + acc_no + ", balance=" + balance + "]";
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class FileHandling6 {
	public static void createAccount(Accounts arr[],File f, RandomAccessFile raf) throws IOException {
		raf.seek(f.length());
		for(Accounts a:arr) {
			raf.writeUTF(a.getName());
			raf.writeInt(a.getAcc_no());
			raf.writeDouble(a.getBalance());
		}
		//System.out.println(currentPosition);
	}
	
	public static StringBuilder readAccount(Accounts arr[], File f, RandomAccessFile raf) throws IOException {
		StringBuilder sb=new StringBuilder("");
		raf.seek(0);
		long i=f.length()-1;
		while(raf.getFilePointer()<i-2) {
			
			sb=sb.append(String.valueOf(raf.readUTF())+" ");
			sb=sb.append(String.valueOf(raf.readInt())+" ");
			sb=sb.append(String.valueOf(raf.readDouble())+" ");
			sb=sb.append("\n");
		}
		return sb;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\abc.txt");
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		Accounts arr[]=new Accounts[3];
		arr[0]=new Accounts("Hemant1",1,1000000.0);
		arr[1]=new Accounts("Raj",2,200.0);
		arr[2]=new Accounts("Priyam",3,3000000.0);
		createAccount(arr,file,raf);
		System.out.println(readAccount(arr,file,raf));
		raf.close();
		
	}

}
