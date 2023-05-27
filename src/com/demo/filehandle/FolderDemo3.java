package com.demo.filehandle;

import java.io.File;
import java.io.IOException;

public class FolderDemo3 {
	
	public static void main(String[] args) throws IOException {
		
		String basePath = "src/FileStorage/FileStorage1/test.png";
		
		String folderPath = basePath.substring(0, basePath.indexOf("."));
		System.out.println(folderPath);
		
		String fileName = basePath.substring(basePath.lastIndexOf("/")+1, basePath.length());
		System.out.println(fileName);
		
	    //create a folder
		File createFolder = new File(folderPath);
		
		if(!createFolder.isDirectory()) {
			boolean foldersCreated = createFolder.mkdirs();
			System.out.println(foldersCreated);
		}
		
		//create a file inside above created folder
		File fileCreated = new File(createFolder, fileName);
		boolean createNewFile = fileCreated.createNewFile();
		System.out.println(createNewFile);
		
		
	}

}
