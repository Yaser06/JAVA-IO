package com.yaser.binaryfiles.domain;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileViewer {
	public static byte[] read(File file) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		//Her zaman kullandigimiz Buffer mantigi
		try {
			byte[] data = new byte[in.available()]; //Engellenmeyen boyut kadar alan aciyoruz.
			in.read(data);
			return data;
		} finally {
			in.close();
		}
	}

	// Overloaded version of method
	public static byte[] read(String filePath) throws IOException {
		return read(new File(filePath).getAbsoluteFile());
	}
}
