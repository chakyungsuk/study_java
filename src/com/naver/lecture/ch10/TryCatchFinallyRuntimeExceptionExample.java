package com.naver.lecture.ch10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {

//		사전조치가 더 중요한 것 같다.
		
			String data1 = null;
			String data2 = null;
		try {		
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(NumberFormatException e) {			//예외는 경험적으로 작성을 하는 부분이 있고 모호하면 Exception 사용
			System.out.println("숫자로 변활할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
