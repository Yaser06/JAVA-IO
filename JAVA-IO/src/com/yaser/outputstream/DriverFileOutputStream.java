package com.yaser.outputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* BufferedOutputStream kullandýk.Peki Buffer nedir Bufferý kamyon olarak düsünün önceden malzemeyi elimizde tek tek tasiyorduk.
 * Simdi buffer sayesinde kamyon kullanýp tek seferde tasýyormus gibi düsünebiliriz.
 */

public class DriverFileOutputStream {
	public static void write(String fileName,String message) {
		try(BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(fileName))){
			bufferedOutputStream.write(message.getBytes());
			//get.Bytes() -->> Gelen mesajý byte olarak yazýyoruz.Cünkü Stream islemleri byte düzeyinde calisir.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		write("FileOutputStream", "Java IO is awesome \n Yaser AKTAS");
	}

}
