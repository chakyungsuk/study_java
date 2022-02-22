package com.naver.lecture.ch06;

public class FifthCarExample {

	public static void main(String[] args) {

		FifthCar fifthcar = new FifthCar();
		
		fifthcar.keyTurnOn();
		fifthcar.run();
		int speed = fifthcar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}

}
