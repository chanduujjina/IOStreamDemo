package com.demo.filehandle.byteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo1 {

	public static void main(String[] args) {
		
		//create byteArray
		byte byteArray []= {65,66,67,68};
		
		try (//write byte data to stream
		 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
			byteArrayOutputStream.write(byteArray);
			
			//Write the bytedata the file
			String basePath = "src/SanLocation/JAVA/second.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(basePath);
			byteArrayOutputStream.writeTo(fileOutputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
