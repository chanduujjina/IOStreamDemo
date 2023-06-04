package com.demo.filehandle.byteArray;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo1 {

	public static void main(String[] args) {
		
		String basePath = "src/SanLocation/JAVA/dataStream1.txt";
		try (FileInputStream fis = new FileInputStream(basePath);
				DataInputStream dataInputStream = new DataInputStream(fis)) {
			int readInt = dataInputStream.readInt();
			System.out.println(readInt);
			double readDouble = dataInputStream.readDouble();
			System.out.println(readDouble);
			boolean readBoolean = dataInputStream.readBoolean();
			System.out.println(readBoolean);
			System.out.println("-----------------------------");
			
			  int i =0; 
			  while((i=dataInputStream.read())!=-1) 
			  {
				  System.out.print((char)i);
			  }
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
