package com.yaser.writer;

import java.io.FileWriter;
import java.io.IOException;
/*Dipnot-->>>Kaynak dosyasi incelemek icin Ctrl tusuna basili tutup FileWriter üstüne geldiginizde
 *OpenDeclaration ve OpenÝmplementation görürsünüz oradaki OpenDeclaration tiklarsaniz kaynak dosyasini inceleyebilirsiniz.*/

public class DriverFileWriterWithAppend {
	public static void writeWithAppend(String outputFilePath, boolean append) throws IOException {
		FileWriter fileWriter = new FileWriter(outputFilePath, append);

		/* FileWriter aslinda parametre olarak File file beklemekte ama file yerine
		 * String degerde verebiliyoruz. Kaynak dosyalarini
		 * incelerseniz.FileOutputStream ile kendisi file olusturmaktadir.
		 */

		fileWriter.write("ý use to filewriter with append \n");
		fileWriter.close();
	}

	public static void main(String[] args) {
		try {
			writeWithAppend("FileWriterWithAppendOutput", true);
			/*Sürekli kaldigi yerden yazmaya devam ediyor.Digerleri gibi üstüne yazmýyor.True demeseydik.Hep 
			 * bir satir görürdük.Simdi ise new line yaparak her seferinde alt satýra gecirip yeniden yazdiriyoruz.*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
