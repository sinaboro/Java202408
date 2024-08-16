package ex03;

import java.util.Scanner;

/*
 * 문제2>>
	5명 학생 com 점수를 키보드로 입력 받아서
	출력하기
	-> 입력할때도 반복문
	-> 출력시도 반복문
*/

public class 문제2 {

	public static void main(String[] args) {
		
		int[] com = new int[5];  //int크기 5명 방 설정
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 학생 com점수 입력 >> ",
					i+1);
			com[i] = sc.nextInt();			
		}
		
		//출력
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ", ");
		}
		System.out.println();
		
		//최대값 계산
		int max=0;
		for(int i=0; i<5; i++) {
			if(com[i]>max)  //최대값 구함
				max = com[i];
		}
		System.out.println("최대값 : "  + max);
		
		
		//총점 과 평균구하기
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += com[i];
		}
		System.out.println("총점 : " + sum);
		
		double avg = sum/5.0;
		System.out.printf("평균 : %.2f\n", avg);
	}

}
