package com.yaser.outputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* BufferedOutputStream kulland�k.Peki Buffer nedir Buffer� kamyon olarak d�s�n�n �nceden malzemeyi elimizde tek tek tasiyorduk.
 * Simdi buffer sayesinde kamyon kullan�p tek seferde tas�yormus gibi d�s�nebiliriz.
 */

public class DriverFileOutputStream {
	public static void write(String fileName,String message) {
		try(BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(fileName))){
			bufferedOutputStream.write(message.getBytes());
			//get.Bytes() -->> Gelen mesaj� byte olarak yaz�yoruz.C�nk� Stream islemleri byte d�zeyinde calisir.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		write("FileOutputStream", "Java IO is awesome \n Yaser AKTAS");
	}

}
