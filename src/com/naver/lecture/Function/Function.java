package com.naver.lecture.Function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = a(3,4);
//		int sum = (a(3,4)) + (b(3,4));
		int sum1 = b(3,4);
		int sum2 = c(8,4);
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}

//		함수선언
		
	public static int a(int a, int b) {
		
		int sum = a + b;
		
		return sum;
	}
	public static int b(int a, int b) {
		
		int sum1 = a * b;
		
		return sum1;
	}
	public static int c(int a, int b) {
		
		int sum2 = a / b;
		
		return sum2;
	}
	
	
	
	
	
	public static String b () {
		return "";
	}
	
	
}
