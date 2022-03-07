package com.naver.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {

//		Audio audio = new Audio();
		Television television = new Television();
		
//		audio.turnOn();
//		audio.turnOff();
		television.turnOff();
		television.turnOn();
		
		
		System.out.println();
		// 인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 안된다.
	
		// 인터페이스를 구현한 클래스를 사용해야 된다. 할때는!!!
//		RemoteControl remoteControl;	// 인터페이스 변수 선
//		remoteControl = new Audio();	// 구현객체로 초기화
		
		RemoteControl remoteControl = new Audio();
//		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		
	}
}
