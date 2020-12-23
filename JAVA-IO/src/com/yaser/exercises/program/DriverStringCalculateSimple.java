package com.yaser.exercises.program;

public class DriverStringCalculateSimple {
	public static void main(String[] args) {
		String st = "10+3";
		int result;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == '+') {
				result = Integer.parseInt(st.substring(0, i)) + Integer.parseInt(st.substring(i + 1, st.length()));
				System.out.print(result);
			}
		}
		System.out.println("");
		
		//Substring metodunu anlamayanlar icin asagida basit bir yontem.
		String name = "Yaser";
		System.out.println(name.substring(0, 3));
	}
}
