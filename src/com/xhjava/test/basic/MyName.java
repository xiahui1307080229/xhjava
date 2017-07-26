package com.xhjava.test.basic;

public class MyName {
	int Age;
	
	public MyName(String name)
	{
		System.out.println("我的名字是： " + name);
	}
	
	public void MyAge(int age)
	{
		Age = age;
		System.out.println("我的年龄是： " + Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyName Jname = new MyName("小灰灰");
		MyName Zname = new MyName("夏辉");
		Zname.MyAge(23);
		
	}

}
