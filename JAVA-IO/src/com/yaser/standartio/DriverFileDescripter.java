package com.yaser.standartio;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.PrintStream;

public class DriverFileDescripter {
/*FileDescriptor ile dosyalar�n tan�mlamasini yap�yoruz.�rnekte dosyanin
 * gecerliligini sorguladik. Art�k isletim sistemi d�zeyinde calistigini g�stermis olduk.
 * Bu islemi *nix i�letim sistemlerinde kernelda inceledigimizde daha iyi anlayabiliriz.
 */
	public static void main(String[] args) {
		
		try {
			FileDescriptor fileDescriptor = new FileInputStream(new File("Note")).getFD();
			System.out.println(fileDescriptor.valid());

//		FileDescriptor fileDescriptor2=new FileInputStream(new File("NothingFile")).getFD();
//		//Olmayan bir dosyaya valid kontrol� yapalim.Exception aliriz.Dosya olmad�g�n� s�yler.
//		System.out.println(fileDescriptor2.valid());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
