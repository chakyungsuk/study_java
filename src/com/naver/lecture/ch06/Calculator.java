package com.naver.lecture.ch06;

public class Calculator {

	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int plus(int x, int y) {
		int result = x + y;
		return 1;
	}
	
	public double divide(int x, int y) {
		
		double result2 = (double) x / (double)y;
		return 1.0;
	}
		
	public void poweroff() {
		System.out.println("전원을 끕니다.");
	}	
	
	
	
}
