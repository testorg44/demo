package com.apex.sample;

public class prime {

	public static boolean isprimenumer(int num) {
		if ( num<=1) {
		return false;}
		for(int i=2; i<num; ) {
			if (num%i==0) {
				return false;
			}
		}
			
		return true;
		
		}
	
	public static void getprimenumber(int num) {
		for (int l=2;l<=num;l++) {
			if(isprimenumer(l))
			System.out.print(l+",");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isprimenumer(100));
		getprimenumber(100);
	}

}
