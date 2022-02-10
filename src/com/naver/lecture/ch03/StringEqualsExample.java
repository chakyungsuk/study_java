package com.naver.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "차경석";
		String str2 = "차경석";
		String str3 = new String("차경석");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1 = " + result1); // true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2 = " + result2); // false
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
		System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true
		
	}

}
