package com.demo.filehandle;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo2 {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("Test4.txt");
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
			file.setWritable(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
