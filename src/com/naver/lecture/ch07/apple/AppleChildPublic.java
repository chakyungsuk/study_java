package com.naver.lecture.ch07.apple;

public class AppleChildPublic extends Apple{

	public String strAppleChildPublic = "strAppleChildPublic";
	protected String strAppleChildPublic2 = "strAppleChildPublic2";
	String strAppleChildPublic3 = "strAppleChildPublic3";
	private String strAppleChildPublic4 = "strAppleChildPublic4";
	
	public void printAppleChildPublic() {
		System.out.println("AppleChildPublic");
	}
	protected void printAppleChildPublic2() {
		System.out.println("AppleChildPublic2");
	}
	void printAppleChildPublic3() {
		System.out.println("AppleChildPublic3");
	}
	private void printAppleChildPublic4() {
		System.out.println("AppleChildPublic4");
	}
	
}
