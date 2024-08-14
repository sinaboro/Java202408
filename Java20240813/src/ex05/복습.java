package ex05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		
		//두 정수 입력받아서 총점 , 평균 구한다.
		//주석 : ctrl+/
//		{
//			Scanner sc = new Scanner(System.in);  //객체 생성(인스턴스 생성)
//			
//			System.out.println("1번째 정수 입력 >> ");
//			
//			int num1 = sc.nextInt();
//		
//			System.out.println("2번째 정수 입력 >> ");
//			int num2 = sc.nextInt();
//			
//			int sum =  num1 + num2;
//			
//			double avg = sum/2.0;
//			
//			System.out.println("두 수 합 : " + sum + ", 두 수 평균 : " + avg);
//		}
		
		{
			Scanner sc = new Scanner(System.in);  //객체 생성(인스턴스 생성)
			
			int count=0;
			
			System.out.println("1번째 정수 입력 >> ");
			
			int num1 = sc.nextInt();
			count = count+1;
		
			System.out.println("2번째 정수 입력 >> ");
			int num2 = sc.nextInt();
			count = count+1;
			
			int sum =  num1 + num2;
			
			double avg = (double)sum/count;
			//double avg = sum/(double)count;
			
			//double avg = (double)sum/(double)count;
			
			System.out.println("두 수 합 : " + sum + ", 두 수 평균 : " + avg);
		}
		

	}

}
