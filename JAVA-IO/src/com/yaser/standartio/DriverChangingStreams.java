package com.yaser.standartio;

import java.io.File;
import java.io.PrintStream;

public class DriverChangingStreams {
	public static void main(String[] args) {
		
		// Sürekli kullandigimiz println metodunun PrintStreamdan geldigini göstermek istedim.
		PrintStream console =System.out;
		console.println("Yaser"); 
		PrintStream out=null;
		
		try {
			out=new PrintStream(new File("changingOutStream")); //Note olusturduk.
			System.setOut(out); // Burada System cikisini degistirdik.Ve note yazar hale getirdik.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello Java !! now pls write note :)");
		//Üst tarafta olusturdugumuz changinOutStream icine üsteki yaziyi yazdiriyoruz.
		
		if (out != null) {
			out.close();
		}
		System.setOut(console); // ConsolU setleyerek tekrardan cikis sagladik.Consola çýktý verdirdik.
		
		System.out.println("Now in console !!!"); // Tekrardan consola da cikti almaya basladik.
	}

}
