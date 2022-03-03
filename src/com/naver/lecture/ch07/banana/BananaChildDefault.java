package com.naver.lecture.ch07.banana;

class BananaChildDefault extends Banana{

	public String strBananaChildDefault = "strBananaChildDefault";
	protected String strBananaChildDefault2 = "strBananaChildDefault2";
	String strBananaChildDefault3 = "strBananaChildDefault3";
	private String strBananaChildDefault4 = "strBananaChildDefault4";
	
	public void printBananaChildDefault() {
		System.out.println("BananaChildDefault");
	}
	protected void printBananaChildDefault2() {
		System.out.println("BananaChildDefault2");
	}
	void printBananaChildDefault3() {
		System.out.println("BananaChildDefault3");
	}
	private void printBananaChildDefault4() {
		System.out.println("BananaChildDefault4");
	}
}
