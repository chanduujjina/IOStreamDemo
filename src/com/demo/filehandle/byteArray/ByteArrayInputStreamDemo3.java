package com.demo.filehandle.byteArray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo3 {
	
	public static void main(String[] args) throws IOException {
		  
		//will read file/image/video data in the form byte array
		byte[] byteArray = getFileInfoAsBytes();
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
		
		int i =0;
		while((i=byteArrayInputStream.read())!= -1) {
			System.out.print((char)i);
			
		}
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.write(byteArray);
		String basePath = "src/SanLocation/JAVA/first_recieve.txt";
		FileOutputStream fous = new FileOutputStream(basePath);
		byteArrayOutputStream.writeTo(fous);
		
		}
	
	
	
	//byte array will come external source
	public static byte[] getFileInfoAsBytes() {
		byte bytearray [] = null;
		String basePath = "src/SanLocation/JAVA/first.txt";
		try (FileInputStream fileInputStream = new FileInputStream(basePath)) {
			bytearray = new byte[fileInputStream.available()];
			fileInputStream.read(bytearray);
			return bytearray;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bytearray;
	}

}
