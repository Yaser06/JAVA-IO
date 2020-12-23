package com.yaser.channels;

import java.io.File;
import java.io.RandomAccessFile;

public class DriverRandomAccessFileWriteToFile {

	public static void main(String[] args) {

		try {
			String readWriteMode="rw";
			File file =new File("randomAccessFileOutput");
			RandomAccessFile accessFile=new RandomAccessFile(file, readWriteMode);
			accessFile.write("Hello Random Access File".getBytes());//Byte array istiyor.Onun icin getBytes kullandik.
			accessFile.close();
			
			File fileOut =new File("randomAccessFileOutput");
			RandomAccessFile accessFile2=new RandomAccessFile(fileOut, readWriteMode);
			accessFile2.seek(6);
			accessFile2.write('A');
			accessFile2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
