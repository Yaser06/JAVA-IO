package com.yaser.filepath;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

//Relative Path----- Absolute Path
//Tanimlamalari inceleyelim.
//NIO.2 Java 1.7 => Path
public class DriverPath {
	public static void main(String[] args) {
		File file =new File(".");
		String [] paths=file.list();
		System.out.println(Arrays.toString(paths));
	
		Path path=Paths.get("C:/deneme/yaser"); //1.7 ile geldi.Ve birden fazla klasör ismini yazabiliyoruz.
		//Örn: ("C:"),(/deneme/) seklinde de yazabiliriz. Tüm yolu yazmamiza gerek kalmadan.
		
		System.out.println("Parent : " +path.getParent());
		System.out.println("File name : "+  path.getFileName()); // en sondaki dosyanin ismini verir.
		
		Path root =path.getRoot();
		System.out.println("ROOT Windows : " + root);// Windows icin bu dur. C:\ veya baska harfte olabilir.
		// *nix ler icin root /: forwardslashdýr.
		
		System.out.println("Ýs absolute : " +path.isAbsolute()); // roottan baslamazsa false verir
		System.out.println("Name Count : " +path.getNameCount());// 2 cünkü deneme ve yaser toplamda 2 dir.
		System.out.println("endWith yaser : " +path.endsWith("yaser"));
		System.out.println("endWith ser : " + path.endsWith("ser"));
		// Burada bütün olarak bakmamiz gerekmekte dosyanin ismi yaser onun icin false
		System.out.println("endWith Paths.get : "+ path.endsWith(Paths.get("yaser")));
	
		Path path2=Paths.get("yaser/deneme/com/./calisma/sahasi/../aktas/driver");
		System.out.println("Normalize  :"  +path2.normalize());
		//Normalize (.)(..) gibi islemlerin anlamsizligini kaldirir.Ve path düzenler.
		
		System.out.println("Resolve after : " +path2.resolve("sonunaekle"));//Farketmemiz gereken resolve yaptýk.
		//Normalizeden sonra yapmamimiza ragmen normalize olmamis haline ekliyoruz.Yani pathler immutabledir.Ayni string gibi
	
		
		//File System ile de dosya arama islemi yapabiliriz.
		FileSystems.getDefault().getPath("/");
		Path path3=Paths.get("/","yaser","deneme"); // Ayný anda bir kac kelime ile getirme islemi yapabilirz.
		System.out.println(path3);
		
		
		
	
	}

}
