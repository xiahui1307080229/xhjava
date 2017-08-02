package com.xhjava.test.basic;

interface Example{
	public void eat();
	public void travel();
}

public class JieKou implements Example {

	public void eat(){
	      System.out.println("Mammal eats");
	   }
	 
	   public void travel(){
	      System.out.println("Mammal travels");
	   } 
	 
	   public int NoOfLegs(){
	      return 0;
	   }
	 
	   public static void main(String args[]){
	      JieKou m = new JieKou();
	      m.eat();
	      m.travel();
	   }
}
