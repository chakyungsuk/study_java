package com.naver.lecture.ch07.apple;

public class Apple {

	public String strApple = "strApple";
	protected String strApple2 = "strApple2";
	String strApple3 = "strApple3";		// default
	private String strApple4 = "strApple4";

	
	public void printApple() {
		System.out.println("Apple");
	}
	protected void printApple2() {
		System.out.println("Apple2");
	}
	void printApple3() {
		System.out.println("Apple3");
		
//		private는 내부에서만 사용 가능
		this.printApple4();
	}
	private void printApple4() {
		System.out.println("Apple4");
	}
	
}
