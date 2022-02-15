package com.naver.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		
		int[] var1 = {2,3,4,5,6,7,8,9};
		int[] var2 = {2,3,4,5,6,7,8,9};
		
		int var3 = 0;
		
		for (int i=0; i<var1.length; i++) {
			for (int j=0; j<var2.length; j++){
				var3 = var1[i]*var2[j];
				
				System.out.println(var1[i] + " x " + var2[j] + " = " + var3);
			}
		}
	}

		

	}


