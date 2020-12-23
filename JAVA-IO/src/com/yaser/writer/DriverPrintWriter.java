package com.yaser.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//PrintWriter kullanarak kolay bir sekilde dosya olusturup yazma islemi gerceklestirdik.Kaynak Dosya inceleyiniz.Önemli..
public class DriverPrintWriter {
	public static void main(String[] args) {

		try (PrintWriter printWriter = new PrintWriter(new File("PrintWriterOutput"));) {//Dosyayi olusturduk
			printWriter.println("I use to printwriter "); //dosya icine yazma islemini yaptik.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
