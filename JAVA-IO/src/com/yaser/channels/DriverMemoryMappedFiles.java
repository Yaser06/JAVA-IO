package com.yaser.channels;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class DriverMemoryMappedFiles {
	//GB d�zeyindeki dosyalari okumak icin kullaniyoruz.
	
	private static int size = 0x8FFFFFF;
	
	public static void main(String[] args) {
		try {
			MappedByteBuffer maBuffer =new RandomAccessFile("Note", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, size);
		//WR�T�NG READ�NG PROSES
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
