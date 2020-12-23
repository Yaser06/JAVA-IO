package com.yaser.channels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class DriverFileChannelTransfer {
	public static void main(String[] args) {
		
		try {
			File source =new File("randomAccessFileOutput");
			FileChannel inChannel=new FileInputStream(source).getChannel();
			//FileInputStream ile okuma islemi yaptýgimiz belli.
			
			File destination =new File("randomAccessFileOutput_transfer_copy");
			FileChannel outChannel =new FileOutputStream(destination).getChannel();
			//FileOutputStream ile yazma islemi yapacagimiz belli.
			
			inChannel.transferTo(0, inChannel.size(), outChannel);
			//Kopyalama islemi gerceklestiriyoruz.En basýndan inChannel okudugu dosyanýn uzunlugu kadarini
			//outChannel yaz diyoruz ve kopyalama islemini bu sekilde gerceklestirmis oluyoruz.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
