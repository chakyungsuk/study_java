package com.naver.lecture.ch07;

public class Cat extends Animal{

	//생성자
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
