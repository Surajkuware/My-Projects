package com.jspiders.filehandeling.readingCharData;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadChracterData {
		public static void main(String[] args) {
			
			File file=new File("CharWrite.txt");
			
			try {
				
				if (file.exists()) {
					System.out.println("File Already Exist...");
				}
				else {
					
					file.createNewFile();
					System.out.println("File created success..");
				}
				FileReader fileReader=new FileReader(file);
			
				Scanner scanner=new Scanner(file);
					while(scanner.hasNextLine()) {
						
						System.out.println(scanner.nextLine());
					}
				scanner.close();
				fileReader.close();
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
