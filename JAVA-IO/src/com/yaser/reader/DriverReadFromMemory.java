package com.yaser.reader;

import java.io.IOException;
import java.io.StringReader;

//StringReader biliyoruz. Karakter karakter okumaktadir.

public class DriverReadFromMemory {
	public static void main(String[] args) throws IOException {
		
		String txt="Yaser Aktas";
		
		StringReader stringReader =new StringReader(txt);
		
		System.out.println(stringReader.read()); //B�y�k Y harfi ascii karsiligi
		
		System.out.println(stringReader.read()); //K�c�k a harfi ascii karsiligi
		
		System.out.println(stringReader.read()); //K�c�k s harfi ascii karsiligi
		
		
		char ch=(char) stringReader.read(); // 4.harf aldigimizi g�stermek icin char cast ettim.
		System.out.println("4. harf :" + ch);
		stringReader.close();
		
	}

}
