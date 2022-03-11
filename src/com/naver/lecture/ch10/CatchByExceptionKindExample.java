package com.naver.lecture.ch10;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 맥개값의 수가 부족합니다. ");
			System.out.println("[실행 방법] ");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		}
	}

}
