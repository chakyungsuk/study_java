package com.naver.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=45; i++) {
//			for(int j=1; i<=45; i++) {
//				for(int k=1; i<=45; i++) {
//					for(int x=1; i<=45; i++) {
//						for(int y=1; i<=45; i++) {
//							for(int h=1; i<=45; i++) {
//								
//								System.out.println(i + j + k + x + y + h);
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//}
		
		int num1 = (int) (Math.random() * (45 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (45 - 1 + 1) + 1);
		int num3 = (int) (Math.random() * (45 - 1 + 1) + 1);
		int num4 = (int) (Math.random() * (45 - 1 + 1) + 1);
		int num5 = (int) (Math.random() * (45 - 1 + 1) + 1);
		int num6 = (int) (Math.random() * (45 - 1 + 1) + 1);
		
		switch (1) {
		case 1:
			System.out.println("첫번째 번호는" + num1 + "번 입니다.");
		case 2:
			System.out.println("두번째 번호는" + num2 + "번 입니다.");
		case 3:
			System.out.println("세번째 번호는" + num3 + "번 입니다.");
		case 4:
			System.out.println("네번째 번호는" + num4 + "번 입니다.");
		case 5:
			System.out.println("다섯번째 번호는" + num5 + "번 입니다.");
		default:
			System.out.println("여섯번째 번호는" + num6 + "번 입니다.");
			break;
			
		}
	}
}

