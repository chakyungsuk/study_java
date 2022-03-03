package com.naver.lecture.ch07.banana;

public class BananaChildPublic {

	public String strBananaChildPublic = "strBananaChildPublic";
	protected String strBananaChildPublic2 = "strBananaChildPublic2";
	String strBananaChildPublic3 = "strBananaChildPublic3";
	private String strBananaChildPublic4 = "strBananaChildPublic4";
	
	public void printBananaChildPublic() {
		System.out.println("BananaChildPublic");
	}
	protected void printBananaChildPublic2() {
		System.out.println("BananaChildPublic2");
	}
	void printBananaChildPublic3() {
		System.out.println("BananaChildPublic3");
	}
	private void printBananaChildPublic4() {
		System.out.println("BananaChildPublic4");
	}
}
