package com.naver.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("company : " + car.company);
		System.out.println("model : " + car.model);
		System.out.println("color : " + car.color);
		System.out.println("maxSpeed : " + car.maxSpeed);
		System.out.println("speed : " + car.speed);   // 0
		
		car.speed = 300;
		
		System.out.println("speed : " + car.speed);   // 100
		
	
		if(car.speed >= car.maxSpeed) {
			System.out.println("속도가 높습니다.");
		} else {
			System.out.println("속도가 낮습니다.");
		};
		
		upDown(car.maxSpeed, car.speed);
		
		car.speed = 100;
		
	}
	public static void upDown(int maxSpeed, int speed) {
		if(maxSpeed < speed) {
			System.out.println("스피드가 낮습니다.");
		} else if(maxSpeed > speed) {
			System.out.println("스피드가 높습니다.");
		} else {
			System.out.println("스피드가 동등합니다.");
		};
		
	}
}
