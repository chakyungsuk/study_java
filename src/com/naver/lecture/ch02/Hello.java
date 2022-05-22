package com.naver.lecture.ch02;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int i = 0;
		
		for(i=0; i<5; i++) {
			int tmp = (int)(Math.random()*9)+1;
			System.out.print(tmp);
			System.out.print("숫자입력>");
			Scanner sc = new Scanner(System.in);
			int good = sc.nextInt();
		
			if(good == tmp) {
				System.out.println("Strike");
				return;
			} else if(good != tmp) {
				System.out.println("Ball");
			} else {
				// by pass
			}
		}
	}
}
