package com.naver.lecture.ch06;

public class FourthCarExample {

	public static void main(String[] args) {
	
		FourthCar fourthcar = new FourthCar();
		
		fourthcar.setGas(5);
		
		boolean gasgas = fourthcar.isLeftGas();
		if(gasgas) {
			System.out.println("출발합니다");
			fourthcar.run();
		}
		
		if(fourthcar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
