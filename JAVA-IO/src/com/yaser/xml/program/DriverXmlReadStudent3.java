package com.yaser.xml.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DriverXmlReadStudent3 {
	public static void main(String[] args) {

		File file = new File("students.xml");
		StringBuilder stringBuilder;
		String updateName;
		String name;
		List firstName = new ArrayList();
		List lastName = new ArrayList();
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			
			while ((name = bufferedReader.readLine()) != null) {
				stringBuilder = new StringBuilder();
				if (name.contains("<firstName>")) {
					updateName = name.replace("<firstName>", "").replace("</firstName>", "").trim();
					firstName.add(updateName);
				}
				if (name.contains("<lastName>")) {
					updateName = name.replace("<lastName>", "").replace("</lastName>", "").trim();
					lastName.add(updateName);
				}
				System.out.println(name);

			}

			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println("firstName [0]:"+firstName.get(0));
			System.out.println("lastName  [0]:" +lastName.get(0));
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
