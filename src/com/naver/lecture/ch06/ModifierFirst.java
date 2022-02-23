package com.naver.lecture.ch06;

public class ModifierFirst {   // class : public, (difault) 만 가능

	public String name = "";  // field : 
	public String ssn = "";
	
	public ModifierFirst(String ssn) {
		this.ssn = ssn;
	}
	
	public int add(int x, int y) {
		return x + y;
	}

}
