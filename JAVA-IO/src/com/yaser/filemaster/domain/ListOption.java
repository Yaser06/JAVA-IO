package com.yaser.filemaster.domain;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.yaser.filemaster.exception.ExecuteException;

public class ListOption extends Option {
	
	public ListOption() {
		super("l");
		}

	@Override
	public String[] execute(String[] args) throws ExecuteException {
		if(!validate(args)) {
			throw new ExecuteException("Argument not valid");
		}
		String pathStr =args[1];
		Path path =Paths.get(pathStr);
		return path.toFile().list();
	}
	
	private boolean validate(String[] args) {
		return args.length==2;
	}

	@Override
	public String description() {
		return "List any directory";
	}

}
