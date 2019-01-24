package com.apex.sample;

public class C extends B implements A {
int c= 10;
	public static void main(String[] args) {
		C a=new C();
		a.sum();
		a.c=20;
	}
	public void sum() {
		System.out.println("interface example");
	}
	}


