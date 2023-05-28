package com.demo.filehandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuptStreamDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		String fileText = "This is my first line adding in text file";
		
		String basePath = "src/SanLocation/JAVA/First.txt";
		
		String folderPath = basePath.substring(0, basePath.lastIndexOf("/"));
		
		String fileName = basePath.substring(basePath.lastIndexOf("/")+1, basePath.length());
		
		//create a folder
		File folderCreation = new File(folderPath);
		
		if(!folderCreation.isDirectory()) {
			boolean folderCreated = folderCreation.mkdirs();
			System.out.println("file created:"+folderCreated);
		}
		
		//create a file inside above created folder
		
		File fileCreation = new File(folderCreation,fileName);
		
		//to create file
		boolean createNewFile = fileCreation.createNewFile();
		System.out.println("file created:"+createNewFile);
		FileOutputStream fous = null;
		
		try {
			//write the data into file
			fous = new FileOutputStream(fileCreation);
			
			fous.write(fileText.getBytes());
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			if(fous != null) {
				fous.close();
			}
		}
		
	}

}
