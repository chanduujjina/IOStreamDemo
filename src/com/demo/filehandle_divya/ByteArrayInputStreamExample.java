package com.demo.filehandle_divya;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

	
	public static void main(String[] args) throws IOException {

		byte byteArray[] = {1,2,3,4,5,6,7,8,9};
		 
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		int baisAvailable = bais.available();
		System.out.println(baisAvailable);
		int read = bais.read();
		System.out.println(read);
		int baisAvailable1 = bais.available();
		System.out.println(baisAvailable1);
		
		bais.close();
		int read1 = bais.read();
		System.out.println(read1);
		
		
		
		int read2 = bais.read();
		System.out.println(read2);
}
}
