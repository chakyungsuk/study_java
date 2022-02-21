package com.naver.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean korean = new Korean();
		
		System.out.println("korean : " + korean.nation);
		System.out.println("korean : " + korean.name);
		System.out.println("korean : " + korean.ssn);
		
		
		Korean korean2 = new Korean("차경석","064516543");
		
		System.out.println("----------------------------");
		System.out.println("korean : " + korean2.nation);
		System.out.println("korean : " + korean2.name);
		System.out.println("korean : " + korean2.ssn);
		
		Korean korean3 = new Korean("장동건","65456411456");
		
		System.out.println("----------------------------");
		System.out.println("korean : " + korean3.nation);
		System.out.println("korean : " + korean3.name);
		System.out.println("korean : " + korean3.ssn);
	}

}
