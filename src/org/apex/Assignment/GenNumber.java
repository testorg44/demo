package org.apex.Assignment;

public class GenNumber {

	public static void main(String[] args) {

		// Generate 1000 numbers
		System.out.println("Generate 1000 numbers");
		for (int i = 0; i <= 1000; i++) {

			System.out.println(i);
		}
		// Generate multiple of 5 and less than 1000
		System.out.println("Generate multiple of 5 and less than 1000");
		// int k=5;
		// int i=5;
		// while(i<1000)
		for (int i = 5; i < 1000;) {
			// int i=5;

			i = i * 5;
			int k = i;
			if (k <= 1000) {
				System.out.println(i);
			}
		}

		// Generate odd numbers up to 1000
		System.out.println("Generate odd numbers up to 1000");
		for (int i = 1; i < 1000; i++) {
			int k = i % 2;
			if (!(k == 0)) {
				System.out.println(i);
			}

		}

	}
}
