package com.demo.filehandle.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerAssocationDemo {

	public static void main(String[] args) {
		serizeObjectData();
		deserlizeData();

	}
	
    private static void deserlizeData() {
		
		try (FileInputStream fileInputStream = new FileInputStream("stdSer.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			Student std = (Student)objectInputStream.readObject();
			System.out.println(std);
			System.out.println(std.getName());
			System.out.println(std.getId());
			System.out.println(std.getSalary());
			System.out.println(std.getAddress().getAddType());
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void serizeObjectData() {
		
		try (FileOutputStream fileOutputStream = new FileOutputStream("stdSer.txt");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			Student student = new Student(1,"chandu",new Address(1, "present"));
			student.setSalary(Double.valueOf(10000));
			objectOutputStream.writeObject(student);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	
}
