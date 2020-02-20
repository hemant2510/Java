package com.FileHandling;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileHandling2 {
	public static void main(String main[]) {
		File folder = new File("D:\\Training\\Study Material\\Assignments");
		File[] listOfFiles = folder.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		for (int i = 0; i < listOfFiles.length; i++) {
			
			if (listOfFiles[i].isFile()) {
				File file=listOfFiles[i];
				System.out.println("File name -" + file.getName()+"\nlast modified date - " +sdf.format(file.lastModified())+"\nWrite permission - "+ file.canWrite()
				+ "\nRead Permission - "+file.canRead()+"\nExecute Permission - "+file.canExecute()+"\nFile Size - "+(file.length())/1024+" Kb");
				System.out.println();
			}
			else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
	}
}
