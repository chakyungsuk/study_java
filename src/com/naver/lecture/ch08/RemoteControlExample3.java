package com.naver.lecture.ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new SmartTeleviosion();
		Searchable searchable = new SmartTeleviosion();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
//		remoteControl.search();		// ERROR
//		
//		searchable.turnOff();		// ERROR
//		searchable.turnOn();		// ERROR
		searchable.search("아이즈원");
	}
}
