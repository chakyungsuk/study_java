package com.naver.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "JDK" + 1.8;
		String str2 = str1 + "입니다.";
		
		System.out.println("str2 : " + str2);
		
		String strA = " 이름 :";
		String strB = " 전화번호";
		String strC = "";
		
		strC = strA + strB;
		// 이름 : 전화번호
		//
		
		System.out.println("strC :" + strC);
	}

}
