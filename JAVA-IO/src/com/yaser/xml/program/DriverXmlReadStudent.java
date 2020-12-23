package com.yaser.xml.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverXmlReadStudent {
	public static void main(String[] args) {
		File file = new File("students.xml");
		StringBuilder stringBuilder = new StringBuilder();
		boolean izin = false;
		String atama2 = new String();
		String[] stringArray;
		List list = new ArrayList();
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String name;
			while ((name = bufferedReader.readLine()) != null) {

				if (name.contains("<firstName>")) {
					char[] array = name.toCharArray();
					for (int i = 0; i < array.length; i++) {
						if (array[i] == '>') {
							izin = true;
							continue;
						}
						if (array[i] == '<') {
							izin = false;
							continue;
						}

						if (izin) {
							stringBuilder.append(array[i]);
						}
					}

				}
				System.out.println(name);

			}
			System.out.println(stringBuilder);
			stringArray = stringBuilder.toString().split(" ");
			System.out.println(Arrays.toString(stringArray));
			for (int i = 0; i < stringArray.length; i++) {
				if (stringArray[i].length() > 0) {
					list.add(stringArray[i]);
				}
			}

			System.out.println(list);
			System.out.println("firstName [0]:"+list.get(0));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
