package com.naver.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		// 갯수만 우선 정하고 데이터는 나중에 채워 넣겠다.
		String[] strArray = new String[3];

		strArray[0] = "차경석";
		strArray[1] = "장동건";
		strArray[2] = new String("차경석");
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
			
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[0] == strArray[2]);
		
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[1].equals(strArray[2]));
		System.out.println(strArray[0].equals(strArray[2]));
		
	}

}
