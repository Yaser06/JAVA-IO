package com.yaser.channels;

import java.io.File;
import java.io.RandomAccessFile;

public class DriverRandomAccessFile {
	
	public static void main(String[] args) {
		/*RandomAccessFile ile ilk defa modlar karsimiza cikmaya basladi.
		 * r ,rw,rws,rwd
		 * r : sadece okuma    rw : okuma ve yazma
		 * rws: okuma yazma d�s�nda meta dosyadaki g�ncellemenin e�zamanl� yazilmasidir.
		 * rwd: okuma yazma d�s�nda database es zamanl� olarak yazma islemedir.
		 */
		
		
		try {
			File file =new File("changingOutStream");
			RandomAccessFile randomAccessFile=new RandomAccessFile(file, "r");
			randomAccessFile.seek(4); // Offset verip baslatiyoruz.
			//En bastan yazmicakta 4 byte sayip �yle yazmaya baslicak.
			for (int i = 0; i <5; i++) {
				System.out.print((char)randomAccessFile.read());
				//Dosya icerisinde 5 karakter yazdiriyorum.Offsetlenmis halinden sonraki kismini
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
