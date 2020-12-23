package com.yaser.serialization.domain;

import java.io.Serializable;
import java.util.Date;
//Objeyi dýsari aktarmak icin ve geri inceleyebilmek icin serilize ettik.

public class Login implements Serializable{
	
	private Date date=new Date();
	private String username;
	private transient String  password;
	//transient gecici alan olarak düsünülebilir.
	
	public Login(String username , String password) {
		this.username=username;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Login INFO::: \n username : "+username + "\n date: "+date+"\n password:"+ password;
	}
}
