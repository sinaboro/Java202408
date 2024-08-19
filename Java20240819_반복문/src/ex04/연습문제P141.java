package ex04;

import java.util.Scanner;

public class 연습문제P141 {

	public static void main(String[] args) {
		int balance = 0; //잔고
		int deposit = 0; //예금
		int withdrawal = 0; //출금
		
		boolean flag = true;
	
		while(flag) {
			System.out.println("------------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			
			Scanner sc = new Scanner(System.in);
			
			// "1"  ==> 1
			System.out.println("선택> ");
			int num = Integer.parseInt(sc.nextLine()); //문자를 정수 변환
			
			switch(num) {
			case 1:
				System.out.println("예금액> ");
				deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				break;
			case 2:
				System.out.println("출금액> ");
				withdrawal = Integer.parseInt(sc.nextLine());
				balance -= withdrawal;
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("1~4 사이 숫자만 입력 하세요!");
			}
			
		}
		System.out.println("프로그램 종료!!");

	}

}
