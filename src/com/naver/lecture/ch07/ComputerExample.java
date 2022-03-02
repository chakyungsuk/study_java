package com.naver.lecture.ch07;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10;
		
		Calculator calculator = new Calculator();
		
		System.out.println("원면적 : " + calculator.careaCircle(2));
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.careaCircle(2));
	}

}
