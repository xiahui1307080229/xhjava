package com.xhjava.test.basic;

public class Mystatics {
	String name;
	int age;
	String addr;
	String job;
	int salary;
	
	public Mystatics()
	{
		System.out.println("开始你的表演。。。。");
	}
	
	public void getname(String Name)
	{
		name = Name;
		System.out.println("姓名： " + name);
	}
	
	public void getage(int Age)
	{
		age = Age;
		System.out.println("年龄：" + age);
	}
	
	public void getaddr(String Addr)
	{
		addr = Addr;
		System.out.println("住址： " + addr);
	}
	
	public void getjob(String Job)
	{
		job = Job;
		System.out.println("工作类型： " + job);
	}
	
	public void getsala(int Salary)
	{
		salary = Salary;
		System.out.println("薪水 ：" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mystatics user = new Mystatics();
		user.getname("华安");
		user.getage(22);
		user.getaddr("江南");
		user.getjob("管家");
		user.getsala(10000);
		
	}

}
