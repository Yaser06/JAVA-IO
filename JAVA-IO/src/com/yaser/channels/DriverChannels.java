package com.yaser.channels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DriverChannels {
	/*Burda channel üzerinden ByteBuffer kullanarak önce yazma islemi gerceklestirdik.
	Pesinden Baska bir channel olusturarak okuma islemi gerceklestirdik.
	Onceki calismalarimizde ya inputtu yada output kullanmistik, ilk defa yazma ve okuma islemini 
	birlikte, Channellerda görmeye basladik. */
	
	public static void main(String[] args) {
		try {
			FileChannel fileChannel= new FileOutputStream(new File("FileChannel")).getChannel();
			fileChannel.write(ByteBuffer.wrap("HelloChannels".getBytes()));
			//ByteBuffer abstract oldugu icin , ByteBufferin static metodu ile yazma islemini gerceklestirdik.
			fileChannel.close();
			
			
			FileChannel fileChannel2=new FileInputStream(new File("FileChannel")).getChannel();
			ByteBuffer buffer=ByteBuffer.allocate(50); // Okuma Byte allocate ile belirliyoruz.
			fileChannel2.read(buffer);
			buffer.flip(); // flip islemini readden sonra buffer tekrardan 0 pozisyonuna cekmek icin kullaniyoruz.
			
			
			System.out.println((char)buffer.get()); //H harfini getirdik
			System.out.println((int)buffer.getChar());
			System.out.println((int)buffer.getChar());
			System.out.println((char)buffer.get());
			System.out.println((char)buffer.get());
			// int aldiklari icin 32 bit C harfine gectik
			fileChannel2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
