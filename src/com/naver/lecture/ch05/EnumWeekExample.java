package com.naver.lecture.ch05;

import java.awt.peer.SystemTrayPeer;
import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
//		Week abc = Week.MONDAY;
//		Week qwe = Week.SUNDAY;
//		
//		System.out.println(abc);
//		System.out.println(qwe);
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUSEDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
