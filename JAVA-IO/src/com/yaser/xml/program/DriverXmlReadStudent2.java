package com.yaser.xml.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DriverXmlReadStudent2 {
	public static void main(String[] args) {
		File file = new File("students.xml");
		StringBuilder stringBuilder;
		boolean permission = false;
		List list = new ArrayList();
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String name;
			while ((name = bufferedReader.readLine()) != null) {
				stringBuilder = new StringBuilder();
				if (name.contains("<firstName>")) {
					char[] array = name.toCharArray();
					for (int i = 0; i < array.length; i++) {
						if (array[i] == '>') {
							permission = true;
							continue;
						}
						if (array[i] == '<') {
							permission = false;
							continue;
						}

						if (permission) {
							stringBuilder.append(array[i]);
						}
					}
					list.add(stringBuilder.toString().trim());
				}
				System.out.println(name);

			}

			System.out.println(list);
			System.out.println(list.get(0));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
