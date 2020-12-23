package com.yaser.compressing.main;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.zip.GZIPOutputStream;

public class DriverSimpleZip {
	public static void main(String[] args) {
		try {
			File inputFile=new File("to_be_compressed_txt"); //disaridan olusturdugum dosya
			File zipFile=new File("compressed_txt.gz"); //zip dosya ismi
			BufferedReader reader=new BufferedReader(new FileReader(inputFile));
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(zipFile)));
			System.out.println("Writing file is starting ...");
			int c;
			while((c =reader.read()) != -1) {
				bufferedOutputStream.write(c);
				//Okuyup yazma islemini gerceklestirdigim kisim.
			}
			reader.close();
			bufferedOutputStream.close();
			System.out.println("Zip file is created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
