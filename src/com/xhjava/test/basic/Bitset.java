package com.xhjava.test.basic;

import java.util.BitSet;

public class Bitset {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet arr1 = new BitSet(12);
		BitSet arr2 = new BitSet(12);
		
		for(int i = 0; i < 12; i++){
			if (i % 2 == 0) {
				arr1.set(i);
			}
			if (i % 3 != 0) {
				arr2.set(i);
			}
		}
		
		System.out.println("能够被2整除的数： " + arr1);
		System.out.println("不能够被3整除的数： " + arr2);
		
		//与算法描述
		arr1.and(arr2);
		System.out.println("arr1与arr2之后的数放在arr1：  " + arr1);
		
		//或算法描述
		arr1.or(arr2);
		System.out.println("arr1与arr2之后的数放在arr1：  " + arr1);
		
		//非算法描述
		arr1.xor(arr2);
		System.out.println("arr1非arr2之后的数放在arr1：  " + arr1);
		
		//大小设置
		System.out.println("显示大小arr1： " + arr1.size());
		System.out.println("显示大小arr2： " + arr2.size());
	}

}
