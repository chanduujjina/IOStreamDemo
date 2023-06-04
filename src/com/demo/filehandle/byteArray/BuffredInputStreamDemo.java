package com.demo.filehandle.byteArray;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BuffredInputStreamDemo {
	
	public static void main(String[] args) {
		
		
			String basePath = "src/SanLocation/JAVA/second.txt";
			
			try (FileInputStream fis = new FileInputStream(basePath);
					BufferedInputStream bufferedInputStream = new BufferedInputStream(fis)) {
				int i = 0;
				 while((i=bufferedInputStream.read()) != -1) {
					System.out.println((char)i); 
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	

}
