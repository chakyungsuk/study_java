package com.naver.lecture.ch04;

public class IFExample {

	public static void main(String[] args) {
		
		int score = 89;
		
		if(score > 90) {
			System.out.println("점수가 90 보다 큽니다");
			System.out.println("등급은 A 입니다.");
		}
		
// 		블럭을 구성하지 않으면 바로 다음줄까지만 블럭내의 문장으로 이해하고 실행 시킨다.
		
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		
	}

}