package com.naver.lecture.ch04;

public class WhileSumForm1To100Example {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		while (i <= 10) {
			System.out.println(i);
			j += i;
			i ++;
		}
			System.out.println("1~"+ i + "합 :" + j);
	}

}
