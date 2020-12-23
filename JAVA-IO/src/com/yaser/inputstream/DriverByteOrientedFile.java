package com.yaser.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DriverByteOrientedFile {

	public static void read(File file) throws IOException {
		FileInputStream fileInputStream=new FileInputStream(file);
		int c;
		while((c=fileInputStream.read()) != -1) {
			System.out.print(c +" ");
		}
		fileInputStream.close();
	}
	
	public static void main(String[] args) {
		try {
			read(new File("FileOutputStream"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
