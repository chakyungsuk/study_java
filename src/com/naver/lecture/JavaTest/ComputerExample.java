package com.naver.lecture.JavaTest;

public class ComputerExample {

	public static void main(String[] args) {
       
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
        int r = 7;
        
        System.out.println("원의 반지름: " + r);
        System.out.println();
        
        System.out.println("원면적: " + calculator.areaCircle(r));
        System.out.println();
        
        System.out.println("원면적: " + computer.areaCircle(r));
        System.out.println();
    }
}
