package com.yaser.standartio;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.PrintStream;

public class DriverFileDescripter {
/*FileDescriptor ile dosyalarýn tanýmlamasini yapýyoruz.Örnekte dosyanin
 * gecerliligini sorguladik. Artýk isletim sistemi düzeyinde calistigini göstermis olduk.
 * Bu islemi *nix iþletim sistemlerinde kernelda inceledigimizde daha iyi anlayabiliriz.
 */
	public static void main(String[] args) {
		
		try {
			FileDescriptor fileDescriptor = new FileInputStream(new File("Note")).getFD();
			System.out.println(fileDescriptor.valid());

//		FileDescriptor fileDescriptor2=new FileInputStream(new File("NothingFile")).getFD();
//		//Olmayan bir dosyaya valid kontrolü yapalim.Exception aliriz.Dosya olmadýgýný söyler.
//		System.out.println(fileDescriptor2.valid());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
