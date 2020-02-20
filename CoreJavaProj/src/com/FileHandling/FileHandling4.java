package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.*;

public class FileHandling4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin1 = new FileInputStream("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\pqr.txt");
		FileInputStream fin2 = new FileInputStream("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\xyz.txt");
		FileInputStream fin3 = new FileInputStream("D:\\Training\\Java\\CoreJavaProj\\src\\com\\FileHandling\\stu.txt");
		
		FileInputStream f[]=new FileInputStream[3];
		f[0]=fin1;
		f[1]=fin2;
		f[2]=fin3;
		
		ArrayList<FileInputStream> l = new ArrayList<FileInputStream>();
		Collections.addAll(l, f);
		Enumeration e=Collections.enumeration(l);
		SequenceInputStream sis = new SequenceInputStream(e);
		int i = 0; 
        while((i = sis.read())!=-1) 
        { 
            System.out.print((char)i); 
        } 
        
        sis.close();
        fin1.close();
        fin2.close();
        fin3.close();

	}

}
