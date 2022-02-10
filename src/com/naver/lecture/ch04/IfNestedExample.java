package com.naver.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score = 95;
		String grade = "";
		
		if(score >= 90) {
			if(score >=95) {
				grade = "A+";
			} else  {
				grade = "A";
			} else if(score >=85) {
				grade = "b+";
			}
		}

		System.out.println("학점음 : " + grade);
	}

}
