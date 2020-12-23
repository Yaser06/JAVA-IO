package com.yaser.channels;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class DriverMemoryMappedFiles {
	//GB düzeyindeki dosyalari okumak icin kullaniyoruz.
	
	private static int size = 0x8FFFFFF;
	
	public static void main(String[] args) {
		try {
			MappedByteBuffer maBuffer =new RandomAccessFile("Note", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, size);
		//WRÝTÝNG READÝNG PROSES
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
