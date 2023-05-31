package com.demo.filehandle.byteArray;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		
		byte byteArray [] = {1,2,3,4,5,6}	;
		
		ByteArrayInputStream byArrStream = new ByteArrayInputStream(byteArray);
		System.out.println("byte size before reading::"+byArrStream.available());
		int read = byArrStream.read();
		
		System.out.println(read);
		System.out.println("byte size after reading one byte::"+byArrStream.available());
		
		byArrStream.close();
		
		int read2 = byArrStream.read();
		System.out.println(read2);
		
		
		
		
		}

}
