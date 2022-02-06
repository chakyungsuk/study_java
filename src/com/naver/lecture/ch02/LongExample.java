package com.naver.lecture.ch02;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		
		
		long var3 = 10000000000;     // int 범위를 벗어나는 데이터일 경우에는 뒤에 'L'을 붙여준다.
		long var4 = 10000000000L;
	
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
