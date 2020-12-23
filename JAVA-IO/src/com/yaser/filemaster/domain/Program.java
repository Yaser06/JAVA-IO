package com.yaser.filemaster.domain;

import java.util.ArrayList;
import java.util.List;

import com.yaser.filemaster.exception.NoSuchOptionException;

public class Program {
	private static List <Option> options;
	public Program() {
		this.options=new ArrayList<Option>();
	}

	public Program(List<Option> options) {
		this.options=options;
	}
	public void registerOption(Option option) {
		this.options .add(option);
	}
	private static void printUsageHeader() {
		System.out.println("###File Master Usage ####");
		System.out.println("filemaster [OPTION] [VALUE]...");
	}
	public Option findOption(String tag) throws NoSuchOptionException{
		Option option =null;
		for(Option o : options) {
			if(o.getTag().equalsIgnoreCase(tag)) {
				option=o;
			}else {
				throw new NoSuchOptionException();
			}
		}
		return option;
	}
	
	public static boolean validateProgramOption(String optionKey) {
		return optionKey.startsWith(Option.OPTION_DELIMITER);
	}
	
	public static void printUsage() {
		printUsageHeader();
		for(Option option:options) {
			System.out.println(option.getTag()+" :" + option.description());
		}
	}
	
}
