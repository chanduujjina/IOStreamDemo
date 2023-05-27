package com.demo.filehandle;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo1 {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("Test2.txt");
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
			file.setReadOnly();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
