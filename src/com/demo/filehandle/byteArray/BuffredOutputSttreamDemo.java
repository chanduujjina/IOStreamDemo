package com.demo.filehandle.byteArray;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffredOutputSttreamDemo {

	public static void main(String[] args) {
		
		String basePath = "src/SanLocation/JAVA/third.txt";
		
		try (FileOutputStream fous = new FileOutputStream(basePath);
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fous)) {
			String data = "this is my test data for buffered array";
			
			bufferedOutputStream.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
