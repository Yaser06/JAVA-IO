package com.yaser.serialization.domain;

import java.io.Serializable;

public class OtherData implements Serializable {
	String name;

	public OtherData(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
