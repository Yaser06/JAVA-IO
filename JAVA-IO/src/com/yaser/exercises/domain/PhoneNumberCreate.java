package com.yaser.exercises.domain;

import java.io.Serializable;

public class PhoneNumberCreate implements Serializable {

	private String name;
	private String surName;
	private String telNumber;

	public PhoneNumberCreate() {
	}

	public PhoneNumberCreate(String name, String surName, String telNumber) {
		this.name = name;
		this.surName = surName;
		this.telNumber = telNumber;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Name : " + name + "  Surname : " + surName + " TelNumber: " + telNumber;

	}

}
