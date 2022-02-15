package com.naver.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++)
			System.out.println("arr1["+i+"]:" + arr1[i]);
		
		//
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<3; i++)
			System.out.println("arr1["+i+"]:" + arr1[i]);
	
		//
		
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++)
			System.out.println("arr2["+i+"]:" + arr2[i]);
		
		//
		
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
				
		for(int i=0; i<3; i++)
			System.out.println("arr2["+i+"]:" + arr2[i]);
		
		
		//
		
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++)
			System.out.println("arr3["+i+"]:" + arr3[i]);
		
		//
		
		arr3[0] = "장동건";
		arr3[1] = "원빈";
		arr3[2] = "고소영";
		
		for(int i=0; i<3; i++)
			System.out.println("arr2["+i+"]:" + arr3[i]);
		
	}
}
