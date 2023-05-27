package com.demo.filehandle;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo2 {

	public static void main(String[] args) throws IOException  {
		
		String basePath ="src/FileStorage/FileStorage1/chandu1.txt";
		 try (FileOutputStream fileOutputStream = new FileOutputStream(basePath)) {
			String fileText ="This is my first line added in the file";
			fileOutputStream.write(fileText.getBytes());
		}
		 catch(IOException ex) {
			 ex.printStackTrace();
		 }
		

	}

}
