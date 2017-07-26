package com.xhjava.test.basic;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Mulexc {
	int x;
	int y;
	
	public void Muline(int sum1 , int sum2)
	{
		x = sum1;
		y = sum2;
		System.out.println("»ý£º" + x * y);
	}
	
	public void mulsum()
	{
		int i;
		int j;
		for(i = 1;i<10;i++)
		{
			for(j = 1;j <= i;j++)
			{
				System.out.print("  " + i * j);
			}
		System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mulexc sum = new Mulexc();
		sum.Muline(5, 6);
		sum.mulsum();
	}

}
