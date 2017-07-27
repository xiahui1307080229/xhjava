package com.xhjava.test.basic;

	class A{                    
    public void fun1(){         
    	System.out.println("fun1");
    }
    public void fun2(){
    	System.out.println("fun2");
    }
};
	class B extends A{
    public void fun1(){        
    	System.out.println(">fun1");
    }
    public void fun2(){
    	System.out.println("fun3");
    }
};
public class OverLoad{
    public static void main(String asrgs[]){
        B b = new B() ;        
        A a = b ;            
        a.fun1() ;            
        a.fun2() ;
    }
}
