package com.naver.lecture.ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NOMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
	}

}
