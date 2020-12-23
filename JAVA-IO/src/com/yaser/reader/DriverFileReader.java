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
		// Tek satýr tek satir aliyoruz.
		
		
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());
		// System.out.println(bufferedReader.readLine());

		String line = null;
		// Bufferla aldýgýmýzý line aktarip yazdirip .Null olana kadar ayni islemi tekrarliyoruz.
		//
		while ((line = bufferedReader.readLine()) != null) {
			if(line.equals("")) continue; // Bu aralardaki boslugu yazdirmamak icin.
			System.out.println(line);
		}
		
		
		//Ust Taraftaki While döngüsünü taným satirina alip asagidaki kodu denerseniz.Neden line atama islemi yaptigimizi
		//daha iyi anlarsiniz.
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
	}

	public static void main(String[] args) {

		try {
			read("Note"); 
			// Note JAVA-I-O klasöründe olmasýndan dolayý okuyabiliyoruz yoksa bu sekilde bulamayiz.
			//Path vermemiz gerekmektedir.Bulamadýgýmýz durumda exception firlatir.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
