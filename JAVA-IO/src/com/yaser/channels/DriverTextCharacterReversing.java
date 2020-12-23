package com.yaser.channels;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class DriverTextCharacterReversing {
	/*	"Some Strings" --->>> "oSemS rtnisg"
	 * Istedigimiz SomeStringi ikili olarak yer degistirmek */
	
	
	public static void binaryCharacterReverse(CharBuffer charBuffer) {
		while(charBuffer.hasRemaining()) {
			//hasRemaining isleminde posizyon 0 konumundan limit konumuna kadar okunacak deger olana kadar döngü devam
			
			charBuffer.mark(); //Burada okudugumuz islemi isaretledik.
			char character1=charBuffer.get();
			char character2=charBuffer.get();
			//Birinci ve ikinci karakteri aldýk.
			
			charBuffer.reset();//Artýk isaretlemiz yeri bir daha okumayacagiz.Okumaya kaldigi yerden devam edecek.
			
			charBuffer.put(character2).put(character1);
			//Karakterlerin yerlerini degistirdik.
		}
	}
	public static void main(String[] args) {
		char[] data ="Some Strings".toCharArray();
		ByteBuffer byteBuffer=ByteBuffer.allocate(data.length*2); 
		CharBuffer charBuffer=byteBuffer.asCharBuffer();
		charBuffer.put(data);
		//CharBuffer abstract class ve ByteBuffer kullanarak karakter karakter okuma islemi gerceklestirdik.
		
		System.out.println(charBuffer.rewind());
		//.rewind() Konumu sýfýra ayarlamak ve isaret atmak icin kullaniyoruz.
		binaryCharacterReverse(charBuffer); //Burada yer degistirme islemini yapiyoruz.
		System.out.println(charBuffer.rewind());
		
	}

}
