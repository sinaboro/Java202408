package ex05;

import java.util.Scanner;

/*
 * 연습문제 : 주차 요금 계산
	문제 설명:
	
	주차장을 이용한 시간에 따라 주차 요금을 계산하는 프로그램을 작성하세요. 
	주차 요금은 다음과 같습니다:
	
	0시간부터 1시간까지: 1000원
	1시간 초과 2시간 이하: 2000원
	2시간 초과 3시간 이하: 3000원
	3시간 초과: 5000원
	
	출력예>
	주차 시간을 입력하세요 (시간 단위): 2.5
	주차 요금은 3000원입니다.
 */
public class 주차요금계산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주차 시간을 입력하세요 (시간 단위): ");
		int fee = 0;
		double hours = sc.nextDouble();
		
		if(hours > 3) {
			fee = 5000;
		}else if(hours > 2) {
			fee = 3000;
		}else if(hours > 1) {
			fee = 2000;
		}else {
			fee = 1000;
		}
		
		System.out.printf("주차시간 : %.1f , 주차 요금은 %d원입니다.", hours, fee);
	}

}







