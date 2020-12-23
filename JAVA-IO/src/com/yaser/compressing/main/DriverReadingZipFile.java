package com.yaser.compressing.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

public class DriverReadingZipFile {
	public static void main(String[] args) {
		try {
			File inputZipFile=new File("compressed_txt.gz");
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(inputZipFile))));
			String str;
			while((str=bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
			bufferedReader.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
