package com.demo.filehandle.byteArray;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	
	public static void main(String[] args) {
		
		try (FileInputStream input1 = new FileInputStream("src/SanLocation/JAVA/first.txt");
				FileInputStream input2 = new FileInputStream("src/SanLocation/JAVA/second.txt");
				SequenceInputStream sequenceInputStream = new SequenceInputStream(input2, input1)) {
			int i =0;
			while((i=sequenceInputStream.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
