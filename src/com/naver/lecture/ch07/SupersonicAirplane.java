package com.naver.lecture.ch07;

public class SupersonicAirplane extends Airplane {
	
//	public static final int NOMAL = 1;
//	public static final int SUPERSONIC = 2;
//	
//	public int flyMode = NOMAL;
//
//	@Override
//	public void fly() {
//		if(flyMode == SUPERSONIC) {
//			System.out.println("초음속비행합니다.");
//		} else {
//			super.fly();
//		}
//	}
	
	//상수파일 생성 후 코드
	
	public int flyMode = Constants.NOMAL;

	@Override
	public void fly() {
		if(flyMode == Constants.SUPERSONIC) {
			System.out.println("초고속으로 비행 합니다.");
		} else {
			super.fly();
		}
	}
	
	
}
