package com.naver.lecture.ch07.apple;

public class AloeChildPublic extends Aloe{

	public String strAloeChildPublic = "strAloeChildPublic";
	protected String strAloeChildPublic2 = "strAloeChildPublic2";
	String strAloeChildPublic3 = "strAloeChildPublic3";		// default
	private String strAloeChildPublic4 = "strAloeChildPublic4";

	
	public void printAloeChildPublic() {
		System.out.println("AloeChildPublic");
	}
	protected void printAloeChildPublic2() {
		System.out.println("AloeChildPublic2");
	}
	void printAloeChildPublic3() {
		System.out.println("AloeChildPublic3");
	}
	private void printAloeChildPublic4() {
		System.out.println("AloeChildPublic4");
	}
}
