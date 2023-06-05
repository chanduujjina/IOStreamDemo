package com.demo.filehandle_divya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
          try {
			FileInputStream fileInputStream = new FileInputStream("src/FileStorage/Divya/testFile.txt");
			int i=0;
			
			while((i= fileInputStream.read())!= -1) {
				System.out.print((char)i);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
