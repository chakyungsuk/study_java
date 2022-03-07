package com.naver.lecture.ch08;

public interface RemoteControl {
	
	public String name = "Cha";
	
	//상수
	public static final int MAX_VOLUME = 10;     // public static final 생략되어 있음
	int MIN_VOLUME = 0;

	//추상 메소드	: 구현 클래스에서 무조건 오버라이드 해야 된다.
	void turnOn();			// public abstract 생략되어 잇음
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 : public 생략가능
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해체 합니다");
		}
	}
	
	//정적 메소드 : public 생략가능
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}


}

