package com.yaser.serialization.domain;

import java.io.Serializable;

public class SpecialData implements Serializable {

	private int value;
	private OtherData otherData; //Composition.Projeleri inceleyiniz.Composition ile ilgili proje bulunmaktadýr.

	public SpecialData(int value) {
		this.value = value;
		otherData = new OtherData("Other Data Str");
	}

	@Override
	public String toString() {

		return Integer.toString(value);
	}
}
