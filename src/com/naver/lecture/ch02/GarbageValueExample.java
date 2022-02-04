package com.naver.lecture.ch02;

public class GarbageValueExample {

	public static void main(String[] args) {
		
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) {      ///// 조건까지 계속 돌리는거 for
			var1++;
			var2++;
			System.out.println(i + " : var1 :" + var1 + "\t" +"var2 :" + var2);
		}
		
			
		byte var3 = 125;
		int var4 = 125;
		
		for(int i = 5; i < 0; i--) {
			var3--;
			var4--;
			System.out.println(i + " : var3 :" + var3 + "\t" +"var4 :" + var4);
		}
	}

}
