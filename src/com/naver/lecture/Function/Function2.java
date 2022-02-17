package com.naver.lecture.Function;

import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("먹고 싶은 음식을 고르세요 : 한식 중식 일식 양식");
		
		String myFood = scan.nextLine();
		
		food(myFood);
	}

	public static void food(String myFood) {
		
		String[] korean = {"떡볶이","김밥","비빔밥","떡갈비","김치찌개","된장찌개","김치볶음밥"};
		String[] chinese = {"짜장면","짬뽕","볶음밥","탕수육","춘권","고추잡채"};
		String[] western = {"파스타","리조또","피자","햄버거","스테이크","샐러드"};
		String[] japanese = {"초밥","돈까스","우동","타꼬야끼","사시미"};
		String[] food = null;
		
		switch(myFood) {
			case "한식":
				food = korean;
				break;
			case "중식":
				food = chinese;
				break;
			case "양식":
				food = western;
				break;
			case "일식":
				food = japanese;
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				System.exit(0);
		}
		
//		int num = (int) (Math.random() * (food.length - 1));
		int num = (int) (Math.random() * (food.length + 1));
		
		println(food[num]);
	}
	
	public static void println(String a) {
		System.out.println("오늘 추천 드리는 메뉴는 " + a + "입니다.");
	}	
}