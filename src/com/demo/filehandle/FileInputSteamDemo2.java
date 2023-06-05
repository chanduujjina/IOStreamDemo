package com.demo.filehandle;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		String basePath = "src/SanLocation/JAVA/first.txt";
		
		FileInputStream fis = new FileInputStream(basePath);
		
		System.out.println(fis.available());
		
		char ch1 = (char) fis.read();
		System.out.println(ch1);
		
		System.out.println(fis.available());
		
		char ch2 = (char)fis.read();
		System.out.println(ch2);
		
		System.out.println(fis.available());
		
		fis.skip(6);
		
		char ch3  = (char)fis.read();
		System.out.println(ch3);
		
		System.out.println(fis.available());
		
	}

}
