package com.xhjava.test.basic;

import java.util.BitSet;


public class Bitset {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet arr1 = new BitSet(12);
		BitSet arr2 = new BitSet(12);
		
		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0) {
				arr1.set(i);
			}
			if (i % 3 != 0) {
				arr2.set(i);
			}
		}
		
		System.out.println("�ܹ���2���������� " + arr1);
		System.out.println("���ܹ���3���������� " + arr2);

		//���㷨����
		arr1.and(arr2);
		System.out.println("arr1��arr2֮���������arr1��  " + arr1);
		
		//���㷨����
		arr1.or(arr2);
		System.out.println("arr1��arr2֮���������arr1��  " + arr1);
		
		//���㷨����
		arr1.xor(arr2);
		System.out.println("arr1��arr2֮���������arr1��  " + arr1);
		
		//��С����
		System.out.println("��ʾ��Сarr1�� " + arr1.size());
		System.out.println("��ʾ��Сarr2�� " + arr2.size());
	}

}
