package com.naver.lecture.ch08;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {

		System.out.println("MyClassB-method1()실행");
	}

	@Override
	public void method2() {
//		MyInterface.super.method2();
		
		System.out.println("MyClassB-method2() 실행");
	}

	

}
