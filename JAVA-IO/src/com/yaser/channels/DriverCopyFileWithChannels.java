package com.yaser.channels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DriverCopyFileWithChannels {
	private static final int BUFFER_SIZE = 1024;
	public static void main(String[] args) {
		try {
			File source =new File("randomAccessFileOutput"); //Dosya Acma islemi
			FileChannel inChannel=new FileInputStream(source).getChannel();
			File destination =new File("randomAccessFileOutput_copy"); //Yeni dosyamizi olusturduk
			FileChannel outChannel =new FileOutputStream(destination).getChannel();
			ByteBuffer buffer=ByteBuffer.allocate(BUFFER_SIZE);//1024 kb okuma gerceklestir dedik.
			
			while(inChannel.read(buffer) !=-1) {
				buffer.flip();
				outChannel.write(buffer); //Okudugumuz dosyayi diger dosyaya yazmaya basladik.
				buffer.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Kopyalama islemini gerceklestirdik.
	}

}
