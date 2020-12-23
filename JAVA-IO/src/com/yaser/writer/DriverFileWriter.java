package com.yaser.writer;

import java.io.FileWriter;
import java.io.IOException;
/*Writer ile artýk character chracter okuma islemlerine basliyoruz.
 */

public class DriverFileWriter {
	public static void write(String outputFilePath) throws IOException {
		FileWriter fileWriter = new FileWriter(outputFilePath);
		fileWriter.write("I use to fileWriter");
		fileWriter.close(); // close demezsek cikti alamayiz.Cünkü hala yaziyor gibi görebilir.
	}

	public static void main(String[] args) {
		try {
			write("FileWriteOutput");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
