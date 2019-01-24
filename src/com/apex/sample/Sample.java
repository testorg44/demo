package com.apex.sample;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");

Scanner input=new Scanner(System.in);
System.out.println("enter your name");
String S=input.nextLine();
//System.out.println("hello "+S);


Scanner input1=new Scanner(System.in);
System.out.println("enter your birhday");
int S1=input1.nextInt();
System.out.println("hello "+S+S1);
input1.close();
input.close();
	}

}
