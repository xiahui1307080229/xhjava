package com.xhjava.test.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoCol {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		char c;
		BufferedReader br = new BufferedReader(new 
                InputStreamReader(System.in));
		 System.out.println("�����ַ�, ���� 'q' ���˳���");
		    do {
		       c = (char) br.read();
		       System.out.print(c);
		    } while(c != 'q');

	}

}
