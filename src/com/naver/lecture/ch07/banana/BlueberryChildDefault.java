package com.naver.lecture.ch07.banana;

class BlueberryChildDefault extends Blueberry{
	public String strBlueberryChildDefault = "strBlueberryChildDefault";
	protected String strBlueberryChildDefault2 = "strBlueberryChildDefault2";
	String strBlueberryChildDefault3 = "strBlueberryChildDefault3";		// default
	private String strBlueberryChildDefault4 = "strBlueberryChildDefault4";

	
	public void printBlueberryChildDefault() {
		System.out.println("BlueberryChildDefault");
	}
	protected void printBlueberryChildDefault2() {
		System.out.println("BlueberryChildDefault2");
	}
	void printBlueberryChildDefault3() {
		System.out.println("BlueberryChildDefault3");
	}
	private void printBlueberryChildDefault4() {
		System.out.println("BlueberryChildDefault4");
	}
}
