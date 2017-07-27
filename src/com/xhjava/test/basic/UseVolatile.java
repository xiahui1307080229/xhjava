package com.xhjava.test.basic;

public class UseVolatile {
	 private volatile boolean active;
	    public void run()
	    {
	        active = true;
	        while (active) 
	        {
	            System.out.println("go on!");
	        }
	    }
	    public void stop()
	    {
	        active = false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseVolatile UV = new UseVolatile();
	//	UV.run();
	//	UV.stop();
		UV.stop();
		UV.run();
	}

}






