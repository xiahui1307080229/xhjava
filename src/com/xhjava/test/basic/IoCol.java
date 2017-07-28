package com.xhjava.test.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class IoCol {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sc = scan.next();
		System.out.println("输入SC值：" + sc);
		char c;
		BufferedReader br = new BufferedReader(new 
                InputStreamReader(System.in));
		 System.out.println("输入字符, 按下 'q' 键退出。");
		    do {
		       c = (char) br.read();
		       System.out.print(c);
		    } while(c != 'q');
		    
		    String str;
		    System.out.println("Enter lines of text.");
		    System.out.println("Enter 'end' to quit.");
		    do {
		       str = br.readLine();
		       System.out.println(str);
		    } while(!str.equals("end"));

	}

}
