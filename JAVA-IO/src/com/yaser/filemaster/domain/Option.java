package com.yaser.filemaster.domain;

import com.yaser.filemaster.exception.ExecuteException;

public abstract class Option {
	public final static String OPTION_DELIMITER = "-";
	private String tag;
	public Option(String tag) {
		this.tag=tag;
	}
	public String getTag() {
		return tag;
	}
	
	public abstract <T> T execute(String[] args)throws ExecuteException;
	public abstract String description();
	
	
}
