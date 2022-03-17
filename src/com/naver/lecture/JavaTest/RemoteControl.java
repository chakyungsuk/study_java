package com.naver.lecture.JavaTest;

public interface RemoteControl {

	public final static int max_volume = 10;
	public final static int min_volume = 0;
	
	public void turnon();
	public void turnoff();
	public void setvolume(int volume);
	
	public default void setmute (boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
