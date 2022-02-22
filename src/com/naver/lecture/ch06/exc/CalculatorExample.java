package com.naver.lecture.ch06.exc;

import com.naver.lecture.ch06.Calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result = calculator.plus(5, 6);
		System.out.println("result1 : " + result);
		
		byte x = 10;
		byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("result2 : " + result2);
		
		calculator.poweroff();
	}

}
