package com.naver.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
//		int score = 60;
//		String grade = "";
//		
//		if(score >= 90) {
//			if(score >=95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		} else if (score >= 80) {
//			if(score >= 85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}
//		} else if (score >= 70) {
//			if(score >=75) {
//				grade ="C+";
//			} else {
//				grade = "C";
//			}
//		} else if (score >= 60) {
//			if(score >=65) {
//				grade = "D+";
//			} else {
//				grade = "D";
//			}
//		} else {
//			grade = "F";
//		}
//				
//
//		System.out.println("학점음 : " + grade);
	
		int x = -1;
		int y = 2;
		String good = "";
		
		if(x > 0) {
			if(y > 0) {
				good = "Quadrant1";
			} else {
				good = "Quadrant4";
			}
		} else if (x < 0) {
			if(y < 0) {
				good = "Quadrant3";
			} else {
				good = "Quadrant2";
			}
		}
		
//		int x = -5;
//		int y = 12;
//		
//		if (x > 0 &&  y > 0) {
//			System.out.print("1사분면");
//		} else if ( x < 0 && y > 0) {
//			System.out.print("2사분면");
//		} else if ( x < 0 && y < 0) {
//			System.out.print("3사분면");
//		} else {
//			System.out.print("4사분면");
//		}
	

		
		System.out.println("x, y :" + good);
	}
}
