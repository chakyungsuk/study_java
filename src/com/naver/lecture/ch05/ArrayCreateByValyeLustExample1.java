package com.naver.lecture.ch05;

public class ArrayCreateByValyeLustExample1 {

	public static void main(String[] args) {
		
//		int[] score;	// 선언
//
//		int score2[];	// 선언
//
//		int[] score3 = {1,2,3};		// 객체 생성
//		
//		int score4[] = {4,5,6};		// 객체 생성
//		
//		double[] score6 = {4,5,6};
//		
//		String[] score7 = {"차경석", "전지현", "원빈"};
//		
//		입력이 되는 데이터 타입이 동일해야 된다.
//		순서는 무조건 0 부터 시작한다. -- index
//		총갯수를 원할하게 늘릴수 없다.
		
		int[] score = {83,90,87};
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		int sum=0;
		for(int i=0; i<2; i++) {
			
			sum += score[i];
			
		}
		System.out.println("총합은 :" + sum);
		int avg = sum / 3;
		System.out.println("평균은 :" + avg);
		
		
	}

}
