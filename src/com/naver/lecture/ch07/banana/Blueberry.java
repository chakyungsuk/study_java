package com.naver.lecture.ch07.banana;

class Blueberry {

	public String strBlueberry = "strBlueberry";
	protected String strBlueberry2 = "strBlueberry2";
	String strBlueberry3 = "strBlueberry3";		// default
	private String strBlueberry4 = "strBlueberry4";

	
	public void printBlueberry() {
		System.out.println("Blueberry");
	}
	protected void printBlueberry2() {
		System.out.println("Blueberry2");
	}
	void printBlueberry3() {
		System.out.println("Blueberry3");
	}
	private void printBlueberry4() {
		System.out.println("Blueberry4");
	}
}
