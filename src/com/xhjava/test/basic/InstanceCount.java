package com.xhjava.test.basic;

public class InstanceCount {
	private static int numInst = 0;
	protected static int getCount()
	{
		return numInst;
	}
	
	private static void addInst()
	{
		numInst++;
	}
	
	public InstanceCount() {
		InstanceCount.addInst();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starting with " + InstanceCount.getCount() + " instances");
		for(int i = 0; i < 500; i++)
		{
			new InstanceCount();
		}
		System.out.println("created " + InstanceCount.getCount() + " instances");
	}

}
