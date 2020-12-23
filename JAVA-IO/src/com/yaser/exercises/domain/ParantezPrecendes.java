package com.yaser.exercises.domain;

public class ParantezPrecendes {
	public ParantezPrecendes(String str) {
		birinciparantezBul(str);
	}

	static int count = 0;
	static int startFirstParantez = 0;
	static int startFirstParantezReverse = 0;

	public static int getCount() {
		return count;
	}

	public static int birinciparantezBul(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
				startFirstParantez = i;
			}
		}
		return startFirstParantez;
	}

	public static int parantezesinibul(String str) {
		boolean pass = true;
		for (int i = startFirstParantez; i < str.length(); i++) {
			if (str.charAt(i) == ')' && pass) {
				startFirstParantezReverse = i;
				pass = false;
			}

		}
		return startFirstParantezReverse;

	}

}
