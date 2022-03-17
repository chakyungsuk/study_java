package com.naver.lecture.JavaTest;

public class Television implements RemoteControl{

	public int volume;

	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > RemoteControl.max_volume) {
			volume = (RemoteControl.max_volume);
		} else if(volume < RemoteControl.min_volume) {
			volume = (RemoteControl.min_volume);
		} else {
			
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
}
