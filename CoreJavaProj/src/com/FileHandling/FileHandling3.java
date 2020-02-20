package com.FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Account{
	private String name;
	private int acc_no;
	private double balance;
	
	public Account(String name,int acc_no,double balance) {
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAccNo() {
		return this.acc_no;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Account arr[]=new Account[3];
		arr[0]=new Account("Hemant",1,1000.0);
		arr[1]=new Account("Raj",2,2000.0);
		arr[2]=new Account("Priyam",3,3000.0);
		File file=new File("D:\\Training\\Java\\abc.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(fos);
		for(int i=0;i<arr.length;i++) {
			dos.writeUTF(arr[i].getName());
			dos.writeInt(arr[i].getAccNo());
			dos.writeDouble(arr[i].getBalance());
		}
		
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		DataInputStream dis=new DataInputStream(fis); 
		StringBuilder sb=new StringBuilder("");
		//int i=0;
		while(dis.available()>0) {
			String name = dis.readUTF();
			System.out.print(name+" ");
			int id = dis.readInt();
			System.out.print(id+" ");
			double salary = dis.readDouble();
			System.out.print(salary+" ");
			System.out.println();
			//i=dis.read();
		}
		dis.close(); 
		fis.close();
	}

}
