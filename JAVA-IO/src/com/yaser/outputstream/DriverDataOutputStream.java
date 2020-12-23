package com.yaser.outputstream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DriverDataOutputStream {
	/*DataOutputStream pritive tiplerle basa cikma yöntemimizdir..Ornekte oldugu gibi write islemini double olarak 
	 * yapmissak okuma islememizide double kullanarak yapmamýz gerekmektedir.Yoksa okuma islemini gerceklestiremeyiz.
 	 */ 
	
	public static void writeDataOutput(File file) {
		
		try(DataOutputStream dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			dataOutputStream.writeDouble(3.256895);
			dataOutputStream.writeBoolean(false);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			writeDataOutput(new File("DataOutputStream"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
