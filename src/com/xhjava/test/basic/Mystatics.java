package com.xhjava.test.basic;

public class Mystatics {
	String name;
	int age;
	String addr;
	String job;
	int salary;
	
	public Mystatics()
	{
		System.out.println("��ʼ��ı��ݡ�������");
	}
	
	public void getname(String Name)
	{
		name = Name;
		System.out.println("������ " + name);
	}
	
	public void getage(int Age)
	{
		age = Age;
		System.out.println("���䣺" + age);
	}
	
	public void getaddr(String Addr)
	{
		addr = Addr;
		System.out.println("סַ�� " + addr);
	}
	
	public void getjob(String Job)
	{
		job = Job;
		System.out.println("�������ͣ� " + job);
	}
	
	public void getsala(int Salary)
	{
		salary = Salary;
		System.out.println("нˮ ��" + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mystatics user = new Mystatics();
		user.getname("����");
		user.getage(22);
		user.getaddr("����");
		user.getjob("�ܼ�");
		user.getsala(10000);
		
	}

}
