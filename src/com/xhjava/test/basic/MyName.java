package com.xhjava.test.basic;

public class MyName {
	int Age;
	
	public MyName(String name)
	{
		System.out.println("�ҵ������ǣ� " + name);
	}
	
	public void MyAge(int age)
	{
		Age = age;
		System.out.println("�ҵ������ǣ� " + Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyName Jname = new MyName("С�һ�");
		MyName Zname = new MyName("�Ļ�");
		Zname.MyAge(23);
		
	}

}
