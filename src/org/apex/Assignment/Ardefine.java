package org.apex.Assignment;

public class Ardefine {

	public static void main(String[] args) {
		// Define a arrary with 10 integers and print all the elements with its index
		// number.
		int i[] = new int[10];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		i[6] = 70;
		i[7] = 80;
		i[8] = 90;
		i[9] = 100;
		System.out.println(i.length);
		for (int j = 0; j < i.length; j++) {
			// int k=i.length;
			System.out.println(i[j] + "index number" + j);
		}
	}

}
