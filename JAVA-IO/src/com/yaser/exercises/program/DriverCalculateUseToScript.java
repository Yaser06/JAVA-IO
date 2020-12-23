package com.yaser.exercises.program;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class DriverCalculateUseToScript {
	public static void main(String[] args) throws IOException {

		String str = "15+25+5*25-(10)+(35*3)";

		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("Calculate")));) {
			bufferedOutputStream.write(str.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(new File("Calculate"));
		String str2 = scanner.nextLine();
		System.out.println(str2);

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
		
		try {
			Object result = scriptEngine.eval(str2);
			System.out.println(result);
		} catch (ScriptException e) {
			e.printStackTrace();
		}

	}

}
