package com.naver.lecture.ch06;

public class Television {

	public static String company = "SamSung";
	public static String model = "OLED";
	public static String info;
//	public String version = "1.0"; ----- 에러
	
	static {
		info = company + " " + model;
	}
}
