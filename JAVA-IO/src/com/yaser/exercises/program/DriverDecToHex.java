package com.yaser.exercises.program;

import java.util.Scanner;

public class DriverDecToHex {
	public static void main(String[] args) {
		int memory;
		String str = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		int number = scanner.nextInt();

		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (number > 0) {
			memory = number % 16;
			str = hex[memory] + str;
			number = number / 16;
		}

		System.out.println("Decimal to hexadecimal: " + str);
	}

}
