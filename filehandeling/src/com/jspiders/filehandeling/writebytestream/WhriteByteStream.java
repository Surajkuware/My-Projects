package com.jspiders.filehandeling.writebytestream;

import java.io.File;
import java.io.FileOutputStream;

public class WhriteByteStream {

	
	public static void main(String[] args) {
		
		File file= new File("ByteWrite.txt");
		try {
		if (file.exists()) {
			System.out.println("File already Exists");
			
		}
		else {
			file.createNewFile();
			System.out.println("file Created Success");
		}
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		fileOutputStream.write(55);
		System.out.println("data written success..");
		
		fileOutputStream.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
