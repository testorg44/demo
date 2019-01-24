package org.apex.Assignment;

import java.util.Scanner;

//Write a program to a specified number of generate fibonacci series.
//Note: Read the required count from the keyboard	
public class Assignfibonacci {

	public static void main(String[] args) {
		int index = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fibonacci Number");
		int fib_No = input.nextInt();
		// System.out.println(fib_No);
		int k = 1;
		while (k <= fib_No) {
			System.out.println(Fibgenno(index));
			index++;
			k++;
		}
input.close();
	}

	public static long Fibgenno(int i) {
		if (i == 0)
			return 0;
		if (i <= 2)
			return 1;

		long fibNo = Fibgenno(i - 1) + Fibgenno(i - 2);
		return fibNo;

	}
}
