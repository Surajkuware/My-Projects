package com.jspiders.Serializaiotndesrialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {

		File file = new File("Employee1.txt");
		try {
			file.createNewFile();
			
			FileOutputStream outputStream = new FileOutputStream("file");

			Employee employee = new Employee();
			employee.setId(1);
			employee.setName("suraj kuware");
			employee.setCity("pune");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(employee);
			
			System.out.println("object Written to file success....");
			objectOutputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
