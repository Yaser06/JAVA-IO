package com.yaser.standartio;

import java.io.File;
import java.io.PrintStream;

public class DriverChangingStreams {
	public static void main(String[] args) {
		
		// S�rekli kullandigimiz println metodunun PrintStreamdan geldigini g�stermek istedim.
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
		//�st tarafta olusturdugumuz changinOutStream icine �steki yaziyi yazdiriyoruz.
		
		if (out != null) {
			out.close();
		}
		System.setOut(console); // ConsolU setleyerek tekrardan cikis sagladik.Consola ��kt� verdirdik.
		
		System.out.println("Now in console !!!"); // Tekrardan consola da cikti almaya basladik.
	}

}
