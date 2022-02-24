package com.naver.lecture.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//자식 프로그램 클래스
		
		//DmbCellphone 객체 생성 : 자식
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//Cellphone 으로부터 상속 받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);

		//DmbCellphone 의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//Cellphone으로부터 상속 받은 메소드 호출
		dmbCellPhone.poweOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 ! 저는 차경석입니다");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다");
		dmbCellPhone.hangUP();
		
		//DmbCellphone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOFFDmb();
	}

}
