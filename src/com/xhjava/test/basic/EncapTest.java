package com.xhjava.test.basic;

public class EncapTest{
	private String name;
	private String Id;
	private int age;
	
	public String getname(){
		return name;
	}
	public String getId(){
		return Id;
	}
	public int Age(){
		return age;
	}
	
	public void getname(String Name){
		this.name = Name;
	}
	public void getId(String id){
		this.Id = id;
	}
	public void getage(int Age){
		this.age = Age;
	}
	public static void main(String[] args){
		
		EncapTest encap = new EncapTest();
		encap.getage(23);
		encap.getId("1307080229");
		encap.getname("xiahui");
		System.out.println("学生姓名 ： " + encap.name + "  学生ID： " + encap.Id + "  年龄： " + encap.age);
	}
}