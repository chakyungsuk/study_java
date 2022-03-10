package com.naver.lecture.ch08;

public class DefaultMethodExample {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClassA();
		
		myInterface.method1();
		myInterface.method2();
		
		MyInterface myInterface2 = new MyClassB();
		
	
		myInterface2.method1();
		myInterface2.method2();
	}

}
