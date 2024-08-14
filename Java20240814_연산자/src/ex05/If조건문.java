package ex05;

import java.util.Scanner;

public class If조건문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>> ");		
		int num = sc.nextInt();
		
		//삼항 연산자로 합격 불합격 판단		
//		String result = (num>60) ? "합격" : "불합격";
//		System.out.println(result);
		
		String result = "";
		
		if(num >= 60) {
			result = "합격";
		}
		
		if(num < 60) {
			result= "불합격";
		}
		
		System.out.println(result);
		

	}

}
