package com.naver.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		
		SecondCar secondCar = new SecondCar();
		
		System.out.println(secondCar.company);
		System.out.println(secondCar.model);
		System.out.println(secondCar.color);
		System.out.println(secondCar.maxSpeed);
		
		System.out.println("----------------");
		SecondCar secondCar2 = new SecondCar("모하비");
		
		System.out.println(secondCar2.company);
		System.out.println(secondCar2.model);
		System.out.println(secondCar2.color);
		System.out.println(secondCar2.maxSpeed);
		
		System.out.println("----------------");
		SecondCar secondCar3 = new SecondCar("스포티지","블랙");
		
		System.out.println(secondCar3.company);
		System.out.println(secondCar3.model);
		System.out.println(secondCar3.color);
		System.out.println(secondCar3.maxSpeed);
		
		System.out.println("----------------");
		SecondCar secondCar4 = new SecondCar("스팅어","그린",240);
		
		System.out.println(secondCar4.company);
		System.out.println(secondCar4.model);
		System.out.println(secondCar4.color);
		System.out.println(secondCar4.maxSpeed);
		
	}

}
