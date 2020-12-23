package com.yaser.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DriverFileReader {

	public static void read(String path) throws IOException {

		FileReader fileReader = new FileReader(path); 
		// Bu sekilde yaptigimizde karakter karakter aliyoruz.Tek tek cikti denemesi yapiniz.
		
		// System.out.println((char)fileReader.read());
		// System.out.println((char)fileReader.read());
		// System.out.println((char)fileReader.read());
		// System.out.println((char)fileReader.read());

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		// Tek sat�r tek satir aliyoruz.
		
		
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());

		String line = null;
		// Bufferla ald�g�m�z� line aktarip yazdirip .Null olana kadar ayni islemi tekrarliyoruz.
		//
		while ((line = bufferedReader.readLine()) != null) {
			if(line.equals("")) continue; // Bu aralardaki boslugu yazdirmamak icin.
			System.out.println(line);
		}
		
		
		//Ust Taraftaki While d�ng�s�n� tan�m satirina alip asagidaki kodu denerseniz.Neden line atama islemi yaptigimizi
		//daha iyi anlarsiniz.
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
	}

	public static void main(String[] args) {

		try {
			read("Note"); 
			// Note JAVA-I-O klas�r�nde olmas�ndan dolay� okuyabiliyoruz yoksa bu sekilde bulamayiz.
			//Path vermemiz gerekmektedir.Bulamad�g�m�z durumda exception firlatir.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
