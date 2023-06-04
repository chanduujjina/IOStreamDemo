package com.demo.filehandle.ser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("accountSer2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Account account = (Account)ois.readObject();
			System.out.println(account);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


