package com.naver.lecture.ch07.apple;

class AloeChildDefault extends Aloe{

	public String strAloeChildDefault = "strAloeChildDefault";
	protected String strAloeChildDefault2 = "strAloeChildDefault2";
	String strAloeChildDefault3 = "strAloeChildDefault3";		// default
	private String strAloeChildDefault4 = "strAloeChildDefault4";

	
	public void printAloeChildDefault() {
		System.out.println("AloeChildDefault");
	}
	protected void printAloeChildDefault2() {
		System.out.println("AloeChildDefault2");
	}
	void printAloeChildDefault3() {
		System.out.println("AloeChildDefault3");
	}
	private void printAloeChildDefault4() {
		System.out.println("AloeChildDefault4");
	}
}
