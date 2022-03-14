package com.naver.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {
		
		/* Box<> box = new Box<T>; */
		Box<String> box = new Box<String>();
		// Box 객체 중에서 한개 즉 지네릭 타입은 String 을 된 것이다.
		box.set("차경석");
		String str = box.get();
		
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println(number);
		
		Box<Double> box3 = new Box<Double>();
		box3.set(0.1);
		
		Double asd = box3.get();
		System.out.println(asd);
	
		
	}
}
