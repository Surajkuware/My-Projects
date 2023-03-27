package com.jspiders.filehandeling.readbytestream;

import java.io.File;
import java.io.FileInputStream;

public class ReadByteStream {
	public static void main(String[] args) {
		
		File file=new File("ByteWrite.txt");
		
		try {
			
			if (file.exists()) {
				System.out.println("File already exist...");
			}else {
				
				file.createNewFile();
				System.out.println("file created success...");
				
			}
			FileInputStream inputStream=new FileInputStream(file);
			int read = inputStream.read();
			System.out.println(read);
			System.out.println("data readen success..");
			
			inputStream.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
