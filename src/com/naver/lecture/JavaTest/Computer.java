package com.naver.lecture.JavaTest;

public class Computer extends Calculator {

	public double param2 = Constants.PAI_2;
	
	@Override
	public double param1() {
		System.out.println("");
		return super.param1();
	}
	
}
