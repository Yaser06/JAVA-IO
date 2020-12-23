package com.yaser.exercises.program;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DriverReadFileAndCalculate {
	// int a =3+5+8+11+(20*5);
	public static void main(String[] args) throws IOException {

		String writeInt = "15+25+30+45";
		FileOutputStream fileOutputStream = new FileOutputStream(new File("Calculate"));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		try {
			bufferedOutputStream.write(writeInt.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			bufferedOutputStream.close();
		}

		BufferedReader bufferedReader = new BufferedReader(new FileReader("Calculate"));
		char[] number = bufferedReader.readLine().toCharArray();
		bufferedReader.close();

		
		String str = "";
		int result = 0;
		int last = 0;
		boolean gec = false;
		//      "15+25+30+45"
		for (int i = 0; i < number.length; i++) {

			if (number[i] == ('+')) {
				gec = true;
			} else {
				str += number[i];
			}
			if (i == (number.length - 1)) {
				gec = true;
			}

			System.out.println("str : " + str + " i : " + i);

			if (gec) {
				int showMe = Integer.parseInt(str.substring(last, str.length()));
				System.out.println("showMe Int :  " + showMe);
				System.out.println("");
				result += Integer.parseInt(str.substring(last, str.length()));
				last = str.length();
				gec = false;
			}
		}
		
		System.out.println("Result : " + result);
	}

}
