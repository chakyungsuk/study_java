package com.naver.lecture.ch06;

public class SecondCar {
	
	String company = "기아자동차";
	String model = "";
	String color = "";
	int maxSpeed = 0;
	
	public SecondCar() {
		
	}
	public SecondCar(String model) {
		this.model = model;
	}
	public SecondCar(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public SecondCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
