package com.FileHandling;

import java.io.*;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Training\\Java\\abc.txt"); 
		FileInputStream fis= new FileInputStream(file);
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do {
			i=fis.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		
		File file1=new File("D:\\Training\\Java\\def.txt");
		FileOutputStream fos=new FileOutputStream(file1);
		fos.write(String.valueOf(sb).getBytes());
		fos.flush();
		fos.close();
		fis.close();
	}

}
