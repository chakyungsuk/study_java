package com.naver.lecture.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}

	}

}
