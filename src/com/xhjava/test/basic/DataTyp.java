package com.xhjava.test.basic;

public class DataTyp {

	public static void main(String[] args) {
		
		int x = 5;
		char y = 'g';
		float z = 5.5f;
		
		x = (int)y;
		System.out.println("x= " + x);
		x = y;
		System.out.println("x= " + x);
		x = 124;
		y = (char)x;
		System.out.println("y= " + y);
		x = (int)z;
		System.out.println("x= " + x);
		System.out.println("z= " + z);
	}

}
