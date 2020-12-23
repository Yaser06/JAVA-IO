package com.yaser.exercises.program;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class DriverTextCharacterReversing {
	// "Some String";
	// "oSeM tSirgn";
	public static void main(String[] args) {
		char[] data = "Some Strings".toCharArray();
		ByteBuffer buffer = ByteBuffer.allocate(data.length * 2);
		CharBuffer charBuffer = buffer.asCharBuffer();
		charBuffer.put(data);
		System.out.println("Put to data after :" +charBuffer.position());
		charBuffer.rewind();//position set 0
		System.out.println("Set to rewind after :" +charBuffer.position());
		System.out.println("Before reverse : "+charBuffer);
		
		while (charBuffer.hasRemaining()) {
			//hasRemaining : Mevcut konum ile limit arasinda bir karakter var ise true dondurur.
			charBuffer.mark();
			char c = charBuffer.get();
			char c2 = charBuffer.get();
			charBuffer.reset();
			charBuffer.put(c2).put(c);
		}
		System.out.println("Reverse process: "+charBuffer.rewind());
	}

}
