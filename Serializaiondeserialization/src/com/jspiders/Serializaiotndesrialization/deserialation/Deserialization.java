package com.jspiders.Serializaiotndesrialization.deserialation;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.jspiders.Serializaiotndesrialization.serialization.Employee;

public class Deserialization {

	public static void main(String[] args) {

		try {

			FileInputStream fileInputStream = new FileInputStream("Employee.txt");
			
			
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			Employee employee=(Employee) objectInputStream.readObject();
			System.out.println(employee);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
