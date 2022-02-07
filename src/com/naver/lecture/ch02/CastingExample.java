package com.naver.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		System.out.println("intValue : " + intValue);
		
		char charValue = (char) intValue;
		System.out.println("charValue : " + charValue);   
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue : " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue : " + intValue);
	}

}
