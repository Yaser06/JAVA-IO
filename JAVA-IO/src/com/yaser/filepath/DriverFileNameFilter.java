package com.yaser.filepath;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DriverFileNameFilter {
	public static void main(String[] args) {
		
		File file =new File("C:\\Users\\yaser\\eclipse\\java-2019-09\\eclipse\\workspace\\JAVA-I-O\\src\\com\\yaser\\filepath");
		String [] path =file.list();
		System.out.println(Arrays.toString(path));  //Filtresiz sinif icindeki tüm dosyalar.
		
		
		//Filtreleme iþlemi yaptýk.FilenameFilter interfaceni kullanarak.
		
		String [] path2 =file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File file, String name) {
				
				return name.toLowerCase().endsWith(".java");
			}
		});
		
		//Filtreleme isleminden sonraki icerideki dosyalar.
		System.out.println(Arrays.toString(path2));
		 
		
		
		
	}

}
