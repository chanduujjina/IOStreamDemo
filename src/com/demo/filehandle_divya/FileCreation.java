package com.demo.filehandle_divya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		String basepath = "src/FileStorage/FileStorage1/Divya/testFile.txt";
		
		String folderName = basepath.substring(0, basepath.lastIndexOf("/"));
		System.out.println(folderName);
		
		String fileName = basepath.substring(basepath.lastIndexOf("/")+1,basepath.length());
         System.out.println(fileName);
         
         //Folder creation
         File folderCreation = new File(folderName);
         if(!folderCreation.isDirectory()) {
        	 boolean isFolderCreated = folderCreation.mkdirs();
        	 System.out.println(isFolderCreated);
         }
         
         //file creation
         
         File fileCreation = new File(folderCreation, "testFile.txt");
         boolean createNewFile = fileCreation.createNewFile();
         System.out.println(createNewFile);
         
         //write content into the above created file
         
         FileOutputStream fos = null;
         
         try {
			fos= new FileOutputStream(fileCreation);
			String fileText = "Welcome";
			fos.write(fileText.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		 
	}
	

}
