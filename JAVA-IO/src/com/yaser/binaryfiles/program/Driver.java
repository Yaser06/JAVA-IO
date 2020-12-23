package com.yaser.binaryfiles.program;

import java.io.File;

import com.yaser.binaryfiles.domain.BinaryFileViewer;

public class Driver {
	//Tüm java classlarý ca fa ba be ile baslar deneyebilirsiniz.
	//ornek inceleyiniz.
	
	public static void main(String[] args) {
		try {
			byte [] data=BinaryFileViewer.read(new File("./bin/com/yaser/binaryfiles/domain/A.class"));
			//byte [] data=BinaryFileViewer.read(new File("./bin/com/yaser/binaryfiles/domain/BinaryFileViewer.class"));
			//Bunuda denersiniz baslangic imzasi ca fe ba be
			dumpHexFormat(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dumpHexFormat(byte[] data) {
		int printCount = 1 ;
		for(int i =0 ; i<data.length; i++,printCount++) {
			int hexa=data[i];
			if(hexa < 0) hexa=256 + hexa;
			if(hexa >= 16) {
				System.out.print(Integer.toHexString(hexa)+" ");
			}else {
				System.out.print("0"+ Integer.toHexString(hexa)+" ");
			}
			if((printCount %40)==0) {
				System.out.println();
			}
		}
	}

}
