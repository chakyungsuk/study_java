package com.naver.lecture.ch06.exc;

public class Carprogram {

	public static void main(String[] args) {
		
		int a = 0;
		
		Car car = new Car();
		
		System.out.println(car.company);
		
		car.c = car.a + car.b;
		
		System.out.println(car.c);

	}

}
