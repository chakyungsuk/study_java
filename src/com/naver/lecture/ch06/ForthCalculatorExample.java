package com.naver.lecture.ch06;

public class ForthCalculatorExample {

	public static void main(String[] args) {
		
//		ForthCalculator foCalculator = new ForthCalculator();
		
		double result1 = 10 * 10 * ForthCalculator.pi;
		int result2 = ForthCalculator.plus(10, 5);
		int result3 = ForthCalculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
