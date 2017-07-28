package com.xhjava.test.basic;


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 22;
		System.out.println("第一次输出：" + num);
		num = num -3;
		System.out.println("第二次输出： " + num);
		
		Integer sum = 14;
		sum = num - sum;
		System.out.println("第三次输出： " + sum);
		System.out.println("第四次输出： " + (sum < num));
		sum++;
		num++;
		System.out.println("第五次输出： " + sum+ '\0' + num);
	}

}
 