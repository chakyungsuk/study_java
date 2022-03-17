package com.naver.lecture.JavaTest;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Television television = new Television();
		
		television.turnon();
		television.setmute(true);
		television.setmute(false);
		television.setvolume(100);
		RemoteControl.changeBattery();
		television.turnoff();
	}
}
