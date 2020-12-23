package com.yaser.serialization.program;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.yaser.serialization.domain.SpecialData;

public class DriverSerializeSpecialData {
	public static void main(String[] args) {
		//Standart outputstreamlar gibi islemimizi burada gerceklestirdik.
		try {
			System.out.println("Object serialization process is starting...");
			SpecialData specialData=new SpecialData(980);
			System.out.println("specialData to String: "+ specialData);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("object.out")));
			objectOutputStream.writeObject(specialData); // objeyi yazma islemi gerceklestirdik.
			objectOutputStream.close();
			System.out.println("The object , belongs the type :  " + specialData.getClass().getSimpleName()+" , is persisted successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
