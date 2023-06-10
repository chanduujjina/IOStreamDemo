package com.demo.filehandle.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerInheritanceDemo {

	public static void main(String[] args) {
		
		serizeObjectData();
		deserlizeData();
		

		
	}

	private static void deserlizeData() {
		
		try (FileInputStream fileInputStream = new FileInputStream("empSer.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			Employee emp = (Employee)objectInputStream.readObject();
			System.out.println(emp);
			System.out.println(emp.getName());
			System.out.println(emp.getId());
			System.out.println(emp.getGender());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void serizeObjectData() {
		
		try (FileOutputStream fileOutputStream = new FileOutputStream("empSer.txt");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			Employee employee = new Employee(1, "test", "male", "it", "contract");
			objectOutputStream.writeObject(employee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
