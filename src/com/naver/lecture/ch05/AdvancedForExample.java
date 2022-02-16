package com.naver.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int [] scores = {95,71,84,93,97};
		int a = 0;
		
		for(int food : scores) {
			System.out.println(a + " : food : " + food);
			a++;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		
		
	}
}
