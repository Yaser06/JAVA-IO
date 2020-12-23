package com.yaser.filemaster.main;

import com.yaser.filemaster.domain.ListOption;
import com.yaser.filemaster.domain.Option;
import com.yaser.filemaster.domain.Program;
import com.yaser.filemaster.exception.ExecuteException;
import com.yaser.filemaster.exception.NoSuchOptionException;

public class Driver {
	private static Program program;
	public static void main(String[] args) {
		initializeProgram();
		if(args.length==0) {
			Program.printUsage();
		}
		if(Program.validateProgramOption(args[0])) {
			String tag =args[0].substring(1);
			try {
				Option option =program.findOption(tag);
				Object result=option.execute(args);
				for(String item : (String[]) result) {
					System.out.println(item);
				}
			}catch(NoSuchOptionException e) {
				Program.printUsage();
			}catch(ExecuteException e) {
				Program.printUsage();
			}
		}else {
			Program.printUsage();
		}
		
		
	}
	
	public static void initializeProgram() {
		program=new Program();
		program.registerOption(new ListOption());
	}

}
