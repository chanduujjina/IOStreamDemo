package com.demo.filehandle_divya;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		String basPath = "src/FileStorage/Divya/testFile.txt";
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(basPath);
			String fileText = "This is  my first demo program";
			fileOutputStream.write(fileText.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fileOutputStream.close();
		}
		
	}

}


