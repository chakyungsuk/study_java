package com.naver.lecture.ch08;

public interface MyInterface {

	void method1();		// public abstract
	/* void method2(); */
	
	default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
	
}
