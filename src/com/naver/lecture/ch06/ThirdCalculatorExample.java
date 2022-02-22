package com.naver.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		
		ThirdCalculator thCalculator = new ThirdCalculator();

		double result1 = thCalculator.areaRectangle(10); // 정사각형
	
		double result2 = thCalculator.areaRectangle(10,20); // 직사각형
		
		System.out.println("사각형의 넒이 : " + result1);
		System.out.println("사각형의 넒이 : " + result2);
	}

}
