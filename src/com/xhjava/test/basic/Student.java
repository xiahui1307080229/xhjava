package com.xhjava.test.basic;


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 22;
		System.out.println("��һ�������" + num);
		num = num -3;
		System.out.println("�ڶ�������� " + num);
		
		Integer sum = 14;
		sum = num - sum;
		System.out.println("����������� " + sum);
		System.out.println("���Ĵ������ " + (sum < num));
		sum++;
		num++;
		System.out.println("���������� " + sum+ '\0' + num);
	}

}
 