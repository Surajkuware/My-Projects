package com.jspiders.filehandeling.CharacterWrite;

import java.io.File;
import java.io.FileWriter;

public class CharacterWrite {
		public static void main(String[] args) {
			
			File file=new File("CharWrite.txt");
			
			try {
				if (file.exists()) {
					System.out.println("File already exist..");
					
				}else {
					file.createNewFile();
					System.out.println("file created succeess....");
				}
				
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("hi i am suraj writing this data to the file which i have created");
				System.out.println("data written success..");
				
			fileWriter.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
}
