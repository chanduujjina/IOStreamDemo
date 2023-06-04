package com.demo.filehandle.ser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutStreamDemo1 {
	
	public static void main(String[] args) {
		
		Account account = new Account("SaiBaba", "savings", "100006789654", "icici001");
		
		try (FileOutputStream fous = new FileOutputStream("accountSer4.txt");
				ObjectOutputStream oous = new ObjectOutputStream(fous)) {
			oous.writeObject(account);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
