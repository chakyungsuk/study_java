package com.naver.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
		
//		++ : 1증감 
//		-- : 1감소
		
//		++x; : 피연산자를 1증가 시키고 다른 연산 수행 
//		x++; : 다른 연산 수행 후 피연산자 1 증가
		
		int x = 10;
		int y = 10;
		int z = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		y++;
		System.out.println(y);
		
		z = ++x;
		b = x++;
		
		System.out.println(z);
		System.out.println(b);
	}

}
