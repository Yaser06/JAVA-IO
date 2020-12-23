package com.yaser.filepath;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
	//C:\Users\yaser\eclipse\java-2019-09\eclipse\workspace\JAVA-I-O --->>> Gercek dosya dizinim bu herkeste farkli yerdedir.
	//*nix sistemlerde (\\) kullanmak yerine tek (/) forwardslash kullaniriz.

public class DriverFileAndPath {
	public static void main(String[] args) {
		
		//File file = new File(".");  // (.) koydugumuzda. Bu dizini gösteriyor.Calistigi dizini bulabiliyoruz.
		
		File file =new File("C:\\Users\\yaser\\.\\eclipse\\..\\workspace");
		// Bilerek bu þekilde yazdim.(..)Tekrar üst dizine cik demek icin.
		
		
		String [] path =file.list();
		
		System.out.println("Path icinde bulunan dosyalar : "+Arrays.toString(path)); 
		System.out.println("getName : " +file.getName());//En son olan dizinin ismini gösteriyor.
		
		System.out.println("getPath : " +file.getPath());//Yol dizisinin tamamini gösterir.
		
		System.out.println("getAbsoulutePath: " +file.getAbsolutePath());
		//Mutlak path gösteriyor.Tüm yol haritasýný.Rootdan itibaren
		
		try {
			System.out.println("getConanicalPath : " +file.getCanonicalPath()); 
			// Sadece gideceði yolu gösteriyor.Gereksizleri göstermiyor.Gibi düþünebiliriz.
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}

}
