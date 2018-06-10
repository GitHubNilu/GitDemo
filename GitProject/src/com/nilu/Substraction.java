package com.nilu;

public class Substraction {

	public static void main(String[] args) {
		Substraction sub =new Substraction();
		int result=sub.subtract(60,32);
		System.out.println("Substraction is :"+result);
	}

	private int subtract(int i, int j) {
		
		return i-j;
		
	}

}
