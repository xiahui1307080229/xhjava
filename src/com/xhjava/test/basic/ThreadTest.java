package com.xhjava.test.basic;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableDemo Demo1 = new RunnableDemo("Thread one!");
		Demo1.start();
		RunnableDemo Demo2 = new RunnableDemo("Thread two!");
		Demo2.start();
		
	}

}

class RunnableDemo implements Runnable{
	private Thread T;
	private String TName;
	
	public RunnableDemo(String name) {
		TName = name;
		System.out.println("creating..." + TName);
	}
	public void run(){
		System.out.println("runing..." + TName);
		try{
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread :" + TName + "," + i);
			//	T.sleep(50);
				Thread.sleep(500);
				
			}
		}catch(InterruptedException e){
			System.out.println("Thread :" + TName + "intrrupted...");	
		}
		System.out.println("Thread :" + TName + "exiting...");
	}
	public void start() {
		System.out.println("Thread :" + TName + "Starting...");
		if(T == null){
			T = new Thread(this,TName);
			T.start();
		}
	}
} 


