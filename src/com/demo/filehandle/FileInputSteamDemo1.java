package com.demo.filehandle;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamDemo1 {
	
	public static void main(String[] args) {
		
		String basePath = "src/SanLocation/JAVA/first.txt";
		
		try (FileInputStream fis = new FileInputStream(basePath)) {
			int i =0;
			
			while((i=fis.read()) != -1) {
				//System.out.print("aschii charcter::"+i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
