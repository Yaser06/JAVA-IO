package com.yaser.exercises.program;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.yaser.exercises.domain.PhoneNumberCreate;

public class DriverPhoneNumber {
	public static void main(String[] args) {

		List<PhoneNumberCreate> telNumber = new ArrayList<PhoneNumberCreate>();
		telNumber.add(new PhoneNumberCreate("Yaser", "Aktas", "05351231210"));
		telNumber.add(new PhoneNumberCreate("Kerim", "Yildiz", "05351545405"));
		telNumber.add(new PhoneNumberCreate("Yaser", "Deneme", "05354565405"));

		// System.out.println(telNumber);

		File file = new File("TelNumber");
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(file)));
			// objectOutputStream.writeObject(new PhoneNumberCreate("Yaser", "Aktas","05351231210"));
			// objectOutputStream.writeObject(new PhoneNumberCreate("Kerim", "Yildiz","05351545405"));
			objectOutputStream.writeObject(telNumber);
			objectOutputStream.close();

			java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new FileInputStream(file));
			Object driver;
			System.out.println(objectInputStream.readObject());

			findPerson("Yaser", telNumber);

			System.out.println("Rehber Created");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void findPerson(String name, List<PhoneNumberCreate> telNumber) {
		for (PhoneNumberCreate tel : telNumber) {
			if (tel.getName().equals(name)) {
				System.out.println(tel.toString());
			}
		}
	}

}
