package com.demo.filehandle.byteArray;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo1 {
	
	public static void main(String[] args) {
		
		String basePath = "src/SanLocation/JAVA/dataStream1.txt";
		
		try (FileOutputStream fous = new FileOutputStream(basePath);
				DataOutputStream dataOutputStream = new DataOutputStream(fous)) {
			dataOutputStream.writeInt(1);
			dataOutputStream.writeDouble(Double.valueOf(1000000));
			dataOutputStream.writeUTF("This is chandu");
			dataOutputStream.writeBoolean(true);
			dataOutputStream.writeChar(65);
			String value = "this is test data for data outputstream";
			dataOutputStream.write(value.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
