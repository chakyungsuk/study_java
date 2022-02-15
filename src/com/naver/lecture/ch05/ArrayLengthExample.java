package com.naver.lecture.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] score = {83,90,87};
		
		int sum = 0;
		
		System.out.println("score.length : " + score.length);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합은 : " + sum);
		
		

	}

}
