package com.demo.filehandle.byteArray;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		
		byte byteArray [] = {1,2,3,4,5,6}	;
		
		ByteArrayInputStream byArrStream = new ByteArrayInputStream(byteArray);
		System.out.println("byte size before reading::"+byArrStream.available());
		int read1 = byArrStream.read();
		
		System.out.println(read1);
		byArrStream.mark(4);
		
		int read2= byArrStream.read();
		System.out.println(read2);
		
		
		
		System.out.println("mark method invoked");
		
		int read3 = byArrStream.read();
		System.out.println(read3);
		
		int read4 = byArrStream.read();
		System.out.println(read4);
		
		byArrStream.reset();
		
		System.out.println("reset method invoked");
	     
		int read5 = byArrStream.read();
		System.out.println(read5);
		
		int read6 = byArrStream.read();
		System.out.println(read6);
		
		
		
		
		}

}
