package com.yaser.channels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DriverFileChannelOverRAF {

	public static void main(String[] args) {

		String mode = "rw";
		String content = "A B C D E";

		try {
			RandomAccessFile accessFile = new RandomAccessFile("testRAF_out", mode);
			FileChannel fileChannel = accessFile.getChannel();

			byte[] data = content.getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(data);

			System.out.println("DATA LENGHT : " + data.length);
		   // System.out.println(content.length());
			printBufferInfo(buffer);
			fileChannel.write(buffer);
			printBufferInfo(buffer);
//			
//			accessFile.seek(3); // 3 byte offsetleme islemi gerceklestirdik.
//			accessFile.write("AB".getBytes(), 0, 2); //AB byte cevirip dosyanin icine yazma islemini yaptik.

			System.out.println("FileChannelRead After");
//			buffer.clear(); 
			//flip kapatip clear acarsak pozisyon degisimini görebiliriz yada ikisini birden acip hataya bakiniz.
//			printBufferInfo(buffer);
			fileChannel.read(buffer);
			printBufferInfo(buffer);
			buffer.flip();
			printBufferInfo(buffer);
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			System.out.println("OUT : " + (char) buffer.get());
			//System.out.println("OUT : " + (char) buffer.get());
//			System.out.println((char)buffer.get());
//			System.out.println((char)buffer.get());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void printBufferInfo(ByteBuffer buffer) {
		System.out.println("BUFFER INFO ::: position : " + buffer.position() + ", limit : " + buffer.limit()
				+ ", capacity : " + buffer.capacity());
		
		/*Okuma ve yazma islemlerinden sonra posizyon limit ve capasity degerlerinde degisme islemi gerceklesebilir.
		 *Bunlarý flip ,clear metodlarý kullanarak düzenleriz.Kaynak kodlarýný inceleyiniz atama islemlerini göreceksiniz.*/
	}
}
