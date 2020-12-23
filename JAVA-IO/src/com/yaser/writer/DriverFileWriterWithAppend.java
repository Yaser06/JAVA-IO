package com.yaser.writer;

import java.io.FileWriter;
import java.io.IOException;
/*Dipnot-->>>Kaynak dosyasi incelemek icin Ctrl tusuna basili tutup FileWriter �st�ne geldiginizde
 *OpenDeclaration ve Open�mplementation g�r�rs�n�z oradaki OpenDeclaration tiklarsaniz kaynak dosyasini inceleyebilirsiniz.*/

public class DriverFileWriterWithAppend {
	public static void writeWithAppend(String outputFilePath, boolean append) throws IOException {
		FileWriter fileWriter = new FileWriter(outputFilePath, append);

		/* FileWriter aslinda parametre olarak File file beklemekte ama file yerine
		 * String degerde verebiliyoruz. Kaynak dosyalarini
		 * incelerseniz.FileOutputStream ile kendisi file olusturmaktadir.
		 */

		fileWriter.write("� use to filewriter with append \n");
		fileWriter.close();
	}

	public static void main(String[] args) {
		try {
			writeWithAppend("FileWriterWithAppendOutput", true);
			/*S�rekli kaldigi yerden yazmaya devam ediyor.Digerleri gibi �st�ne yazm�yor.True demeseydik.Hep 
			 * bir satir g�r�rd�k.Simdi ise new line yaparak her seferinde alt sat�ra gecirip yeniden yazdiriyoruz.*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
