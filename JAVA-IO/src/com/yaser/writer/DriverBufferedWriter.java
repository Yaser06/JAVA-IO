package com.yaser.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DriverBufferedWriter {
	public static void main(String[] args) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("BufferedWriterOutput"));) {
			bufferedWriter.write("I use to BufferedWriter");
			//Streamelerde gördügümüz gibi buradada buffer kaynak hedef verilerini barýndýran dizilerdir.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
