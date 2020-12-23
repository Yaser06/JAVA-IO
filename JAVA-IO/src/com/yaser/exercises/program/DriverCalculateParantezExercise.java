package com.yaser.exercises.program;

import com.yaser.exercises.domain.ParantezPrecendes;

public class DriverCalculateParantezExercise {
	public static void main(String[] args) {
		String str = "";
		String intToString = "";
		boolean pass = true;
		boolean pass2 = false;
		boolean toplama=false;
		boolean cikarma=false;
		int count = 0;
		int startFirstParantez = 0;
		int startFirstParantezReverse = 0;
		int lastValue = 0;
		int result = 0;
		int showNumber;

		String calculateValue = "((25+35)+(10+(15+25)+10)+15+25)";
		ParantezPrecendes parantezHesaplama = new ParantezPrecendes(calculateValue);

		count = parantezHesaplama.getCount();
		System.out.println("count" + count);
		while (count-- > 0) {
			startFirstParantez = parantezHesaplama.birinciparantezBul(calculateValue);
			startFirstParantezReverse = parantezHesaplama.parantezesinibul(calculateValue);

			for (int i = startFirstParantez; i <= startFirstParantezReverse; i++) {

				if (calculateValue.charAt(i) == '(' || calculateValue.charAt(i) == ')') {
					continue;
				}
				if (calculateValue.charAt(i) == ('+') || calculateValue.charAt(i)== ('-')) {
					toplama=true;
					pass2 = true;
				} else {
					str += calculateValue.charAt(i);
				}
				if (i == (startFirstParantezReverse - 1)) {
					pass2 = true;
					toplama=true;
				}

				System.out.println("str : " + str + " i : " + i);

				if (pass2) {
					showNumber = Integer.parseInt(str.substring(lastValue, str.length()));
					System.out.println("showMe Int :  " + showNumber);
					System.out.println("");
					
					if(toplama) {
						result += showNumber;
					}
					if(cikarma) {
						result -=showNumber;
						cikarma=false;
					}
					
					lastValue = str.length();
					pass2 = false;
				}
				intToString = result + "";
				System.out.println("result : " + result);

			}

			calculateValue = calculateValue.replace(calculateValue.substring(startFirstParantez, startFirstParantezReverse + 1), intToString);
			System.out.println("new str :" + calculateValue);
			result = 0;

		}

	}

}
