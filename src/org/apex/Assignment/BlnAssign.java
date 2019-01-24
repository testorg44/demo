package org.apex.Assignment;

import java.util.Scanner;

public class BlnAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter  Number");
			int num = input.nextInt();
			System.out.println(num + " is number is PrimeNumber: " + IsPrimeNumber(num));
			System.out.println(num + " is Oddnumber: " + IsOddNumber(num));
			System.out.println(num + " is Integer: " + IsInteger(num));
			System.out.println(num + " is EvenNumber: " + IsEvenNumber(num));
			input.close();
		} catch (Exception e) {
			System.out.println("invalid number");

		}
		
		// System.out.println(num+" is EvenNumber: "+IsEvenNumber(num));
		
	}

	public static Boolean IsInteger(int num) {

		if (num == (int) num) {
			return true;
		}
		return false;
	}

	public static Boolean IsOddNumber(int num) {

		// for (int i=2;i<=num;i++) {
		if (!((num % 2) == 0)) {
			return true;
		}
		// }
		return false;
	}

	public static Boolean IsEvenNumber(int num) {

		// for (int i=2;i<=num;i++) {
		if (num % 2 == 0) {
			return true;
		}
		// }
		return false;
	}

	public static Boolean IsPrimeNumber(int num) {

		// for (int i=2;i<=num;i++) {
		if (num % 2 == 0) {
			return false;
		}
		// }
		return true;
	}

}
