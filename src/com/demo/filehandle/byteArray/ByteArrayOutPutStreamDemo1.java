package com.demo.filehandle.byteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutPutStreamDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		FileOutputStream fous = new FileOutputStream("src/SanLocation/JAVA/First.txt");
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.writeTo(fous);
		
		System.out.println(byteArrayOutputStream.toByteArray());
		
		
	}

}
