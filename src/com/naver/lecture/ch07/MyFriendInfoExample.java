package com.naver.lecture.ch07;

public class MyFriendInfoExample {

	public static void main(String[] args) {
		
		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.name("이순신");
		
		System.out.println("이름 : " + myFriendDetailInfo.name);
		System.out.println("나이 : " + myFriendDetailInfo.age);
		System.out.println("주소 : " + myFriendDetailInfo.address);
		System.out.println("전화 : " + myFriendDetailInfo.number);
		
		

	}

}
