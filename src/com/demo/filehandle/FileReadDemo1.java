package com.demo.filehandle;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo1 {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("src/FileStorage/FileStorage1/chandu.txt")) {
			 int i=0;    
	            while((i=fis.read())!=-1){    
	             System.out.print((char)i);    
	            }    
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
