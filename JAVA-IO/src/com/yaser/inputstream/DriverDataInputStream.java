package com.yaser.inputstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*DataOutputStreamde söyledigimiz gibi Primitive tipler ile basa cikma yöntemimiz bunlardir.Yazdigimiz primitive 
 * tipinde okuma islemi yapmak gerekmektedir.
 */
public class DriverDataInputStream {

	public static void readJavaDataOutputFile(File file) {
		
		try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
			//System.out.println(dataInputStream.readInt());  
			//Tanim satirindan cikartip deneyiniz.Ayný sira ile okunmadiginde nasýl bir cikti verdigini.
			
			System.out.println(dataInputStream.readDouble()); // Sirasini düzgün yazmazsak okumaz.Önce double yazmistik.
			System.out.println(dataInputStream.readBoolean());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readJavaDataOutputFile(new File("DataOutputStream"));
	}
	

}
