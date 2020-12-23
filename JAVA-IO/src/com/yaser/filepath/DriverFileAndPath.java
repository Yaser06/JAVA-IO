package com.yaser.filepath;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
	//C:\Users\yaser\eclipse\java-2019-09\eclipse\workspace\JAVA-I-O --->>> Gercek dosya dizinim bu herkeste farkli yerdedir.
	//*nix sistemlerde (\\) kullanmak yerine tek (/) forwardslash kullaniriz.

public class DriverFileAndPath {
	public static void main(String[] args) {
		
		//File file = new File(".");  // (.) koydugumuzda. Bu dizini g�steriyor.Calistigi dizini bulabiliyoruz.
		
		File file =new File("C:\\Users\\yaser\\.\\eclipse\\..\\workspace");
		// Bilerek bu �ekilde yazdim.(..)Tekrar �st dizine cik demek icin.
		
		
		String [] path =file.list();
		
		System.out.println("Path icinde bulunan dosyalar : "+Arrays.toString(path)); 
		System.out.println("getName : " +file.getName());//En son olan dizinin ismini g�steriyor.
		
		System.out.println("getPath : " +file.getPath());//Yol dizisinin tamamini g�sterir.
		
		System.out.println("getAbsoulutePath: " +file.getAbsolutePath());
		//Mutlak path g�steriyor.T�m yol haritas�n�.Rootdan itibaren
		
		try {
			System.out.println("getConanicalPath : " +file.getCanonicalPath()); 
			// Sadece gidece�i yolu g�steriyor.Gereksizleri g�stermiyor.Gibi d���nebiliriz.
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

}
