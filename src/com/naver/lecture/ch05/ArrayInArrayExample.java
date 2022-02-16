package com.naver.lecture.ch05;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ArrayInArrayExample {

	public static void main(String[] args) {
//		다차원 배열
//		2 * n : (행 * 열) : 가로 * 세로

		int[][] scores = {{99,88,77}, {77,66,55}, {55,44}};
		
//		int[][]	scores2 = new int[3][2];
//		
//		int[][]	scores3 = new int[3][];
//		scores3[0] = new int[2];
//		scores3[1] = new int[2];
//		scores3[2] = new int[2];
		
		System.out.println("scores.length :" + scores.length);
		
		for(int i=0; i<scores.length; i++) {

			System.out.println(scores.length);
			
			for(int j=0; j<scores[i].length; j++) {
				System.out.println("score[" + i + "][" + j +"] " + scores[i][j]);
			}
		
		}
		
		
	}

}
