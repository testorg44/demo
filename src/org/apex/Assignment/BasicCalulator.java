package org.apex.Assignment;

import java.util.Scanner;

public class BasicCalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  Number:");
		int a = input.nextInt();
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter  Number:");
		int b = input1.nextInt();
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("  Arithematic operator + or - or * or /");
		String sign = input2.nextLine();

		if (sign.equals("+")) {
			System.out.println(addition(a, b));
		} else if (sign.equals("-")) {
			System.out.println(substraction(a, b));
		} else if (sign.equals("*")) {
			System.out.println(multiplication(a, b));
		} else if (sign.equals("/")) {
			System.out.println(division(a, b));
		}
input.close();
input1.close();
input2.close();
	}

	public static int addition(int a, int b) {
		int sum = 0;
		return sum = a + b;
	}

	public static int substraction(int a, int b) {
		int sum = 0;
		return sum = a - b;

	}

	public static int multiplication(int a, int b) {
		int sum = 0;
		return sum = a * b;
	}

	public static int division(int a, int b) {
		int sum = 0;
		return sum = a / b;
	}
}