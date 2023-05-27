package com.demo.filehandle;

import java.io.File;
import java.io.IOException;

public class FolderDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		String basePath = "src/FileStorage/FileStorage1/abc.txt";
		
		String baseFolder = basePath.substring(0, basePath.lastIndexOf("/"));
		System.out.println(baseFolder);
		
		String fileName = basePath.substring(basePath.lastIndexOf("/")+1,basePath.length());
		System.out.println(fileName);
		
		//create a folder using file
		File folderCreation = new File(baseFolder);
		if(!folderCreation.isDirectory()) {
			boolean isFolderCreated = folderCreation.mkdirs();
			System.out.println(isFolderCreated);
		}
		
		//create a file inside above created folder
		File fileCreation = new File(folderCreation,"abc.txt");
		boolean createNewFile = fileCreation.createNewFile();
		System.out.println(createNewFile);
		
		
	}

}
