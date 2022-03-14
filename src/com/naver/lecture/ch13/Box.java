package com.naver.lecture.ch13;

public class Box<T> {

	private T t;		// 지금 데이터 타입 정하지 않겠고 나중에 사용할때 정하겠다.

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}
