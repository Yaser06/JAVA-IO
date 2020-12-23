package com.yaser.compressing.main;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DriverMultipleFileZip {
	/*checksum verinin duzgun oldugunun kontrolu icin kullanilan en basit yontemdir.
	 * Veriyi olusturan butun byte'larin degeri toplanir.
	 */
	public static void main(String[] args) {
		String [] fileNames= {"to_be_compressed_txt","changingOutStream","Note"};
		//Dosyalarimizdan string array olusturduk.
		try {
			System.out.println("Files compressing is starting..");
			File zipOutFile=new File("all_files.gz");
			FileOutputStream outputStream=new FileOutputStream(zipOutFile);
			CheckedOutputStream checkedOutputStream=new CheckedOutputStream(outputStream, new CRC32());
			ZipOutputStream zipOutputStream=new ZipOutputStream(checkedOutputStream);
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(zipOutputStream);
			
			for(String fileName: fileNames) {
				BufferedReader bufferedReader=new BufferedReader(new FileReader(new File(fileName)));
				zipOutputStream.putNextEntry(new ZipEntry(fileName));
				int c;
				while((c=bufferedReader.read())!= -1) {
					bufferedOutputStream.write(c);
				}
				bufferedReader.close();
				bufferedOutputStream.flush();
				}
			bufferedOutputStream.close();
			System.out.println("All files are compressed.");
			System.out.println("Checksum: "+ checkedOutputStream.getChecksum().getValue());
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
