package com.naver.lecture.ch06;

public class TelevisionExample {

	public static void main(String[] args) {

		System.out.println(Television.company);
		System.out.println(Television.model);
		System.out.println(Television.info);
//		System.out.println(Television.version); ---- 에러
		System.out.println();
		
		Television television = new Television();
		
		System.out.println(television.company);
		System.out.println(television.model);
		System.out.println(television.info);
	}

}
