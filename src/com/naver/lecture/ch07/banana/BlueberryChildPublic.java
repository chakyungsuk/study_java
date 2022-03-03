package com.naver.lecture.ch07.banana;

public class BlueberryChildPublic extends Blueberry{
	public String strBlueberryChildPublic = "strBlueberryChildPublic";
	protected String strBlueberryChildPublic2 = "strBlueberryChildPublic2";
	String strBlueberryChildPublic3 = "strBlueberryChildPublic3";		// default
	private String strBlueberryChildPublic4 = "strBlueberryChildPublic4";

	
	public void printBlueberryChildPublic() {
		System.out.println("BlueberryChildPublic");
	}
	protected void printBlueberryChildPublic2() {
		System.out.println("BlueberryChildPublic2");
	}
	void printBlueberryChildPublic3() {
		System.out.println("BlueberryChildPublic3");
	}
	private void printBlueberryChildPublic4() {
		System.out.println("BlueberryChildPublic4");
	}
}
