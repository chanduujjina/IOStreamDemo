package com.demo.filehandle;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo1 {

	public static void main(String[] args) throws IOException  {
		
		String basePath ="src/FileStorage/FileStorage1/chandu.txt";
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(basePath);
			
			String fileText ="This is my first line added in the file";
			fileOutputStream.write(fileText.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			fileOutputStream.close();
		}

	}

}
