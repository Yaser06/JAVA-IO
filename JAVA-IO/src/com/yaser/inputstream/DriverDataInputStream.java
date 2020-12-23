package com.yaser.inputstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*DataOutputStreamde s�yledigimiz gibi Primitive tipler ile basa cikma y�ntemimiz bunlardir.Yazdigimiz primitive 
 * tipinde okuma islemi yapmak gerekmektedir.
 */
public class DriverDataInputStream {

	public static void readJavaDataOutputFile(File file) {
		
		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
			//System.out.println(dataInputStream.readInt());  
			//Tanim satirindan cikartip deneyiniz.Ayn� sira ile okunmadiginde nas�l bir cikti verdigini.
			
			System.out.println(dataInputStream.readDouble()); // Sirasini d�zg�n yazmazsak okumaz.�nce double yazmistik.
			System.out.println(dataInputStream.readBoolean());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readJavaDataOutputFile(new File("DataOutputStream"));
	}
	

}
