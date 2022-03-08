package com.naver.lecture.ch08;

public class Example {

	public static void main(String[] args) {
		interfaceA interfaceA = new ImplementationC();
		interfaceB interfaceB = new ImplementationC();
		interfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodC();
		
	}

}
