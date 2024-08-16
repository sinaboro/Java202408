package ex03;

import java.util.Scanner;

/*
 * 문제2>>
	5명 학생 com 점수를 키보드로 입력 받아서
	출력하기
	-> 입력할때도 반복문
	-> 출력시도 반복문
*/

public class 문제3 {

	public static void main(String[] args) {
		
		int[] com = new int[5];
		
		//System.out.println(com.length);
		
		//입력
		for(int i=0; i<com.length; i++) {			
			 com[i] = (int)(Math.random()*101);
		}
		//출력
		System.out.print("출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i] + ", ");
		}
		System.out.println(); //줄 변경
		
		//입력한 data 역순 출력
		System.out.print("역순출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[com.length -1 -i] + ", ");
		}
		System.out.println(); //줄 변경
		
		//최대값 , 최소값 계산
		int max, min;
		max = min= com[0];
//		max = 0;
//		min = 9999;
		for(int i=0; i<com.length; i++) {
			
			if(com[i] > max)
				max = com[i];
			
			if(com[i] < min)
				min = com[i];
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		System.out.printf("최대값 %d, 최소값 : %d\n" , max,min);
		
		//총점 과 평균구하기
		int sum=0;
		for(int i=0; i<com.length; i++) {
			sum += com[i];
		}
		System.out.printf("총점 : %d, 평균:%.2f\n", sum, 
				(double)sum/com.length );
		
		//정렬
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5-1-i; j++) {
				if(com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}			
		}
		
		//정렬 후 출력 : 
		System.out.print("정렬 후 출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i] + ", ");
		}

	}

}
