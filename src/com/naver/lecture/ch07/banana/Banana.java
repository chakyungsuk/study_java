package com.naver.lecture.ch07.banana;

public class Banana {
	public String strBanana = "strBanana";
	protected String strBanana2 = "strBanana2";
	String strBanana3 = "strBanana3";		// default
	private String strBanana4 = "strBanana4";

	
	public void printBanana() {
		System.out.println("Banana");
	}
	protected void printBanana2() {
		System.out.println("Banana2");
	}
	void printBanana3() {
		System.out.println("Banana3");
	}
	private void printBanana4() {
		System.out.println("Banana4");
	}
}
