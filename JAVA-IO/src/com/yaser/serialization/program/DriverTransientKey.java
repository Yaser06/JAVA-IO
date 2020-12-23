package com.yaser.serialization.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

import com.yaser.serialization.domain.Login;


public class DriverTransientKey {
	public static void main(String[] args) {
		try {
			Login login =new Login("superman","PassWordSimple");
			System.out.println("Special Login System...");
			System.out.println(login); //Burada direk objeyi islemsiz yazdigimiz icin password gozükmektedir.
			File logFile=new File("login_log.out");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(logFile));
			objectOutputStream.writeObject(login);
			objectOutputStream.close();
			System.out.println("Login log object persisted to file successfully \n");
			System.out.println("Now ... Let's recover the object from file..");
			TimeUnit.SECONDS.sleep(2);//wait 2 seconds for simulation
			
			java.io.ObjectInputStream objectInputStream=new java.io.ObjectInputStream(new FileInputStream(logFile));
			Login recoveredLoginObject =(Login)objectInputStream.readObject();
			//Object recoveredLoginObject  = objectInputStream.readObject(); // Polymorphic call
			System.out.println("Recovered Login object is :");
			System.out.println(recoveredLoginObject);
			//inceledigimizde password null gözükmektedir.Sebebi ise transient keywordtür.
			objectInputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	
	}

}
