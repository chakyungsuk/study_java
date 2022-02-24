package com.naver.lecture.ch07;

public class Cellphone {
	//부모
	
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void poweOn() {System.out.println("전원을 켭니다.");}
	void powerOFF() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("전원을 켭니다.");}
	void sendVoice(String message) {System.out.println("자기 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangUP() {System.out.println("전화를 끊습니다.");}
}
