package com.demo.filehandle;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/FileStorage/FileStorage1/chandu.txt");
			
			int read = fis.read();
			System.out.println((char)read);
			
			fis.close();
			
			int read1 = fis.read();
			System.out.println((char)read1);
			
		
	}

}
