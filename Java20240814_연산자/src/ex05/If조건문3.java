package ex05;

import java.util.Scanner;

public class If조건문3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>> ");		
		int num = sc.nextInt();
		
		//삼항 연산자로 num >= 90, A, 80>= B, 70 >= C, 나머지는 F		
		String result = (num >= 90) ? "A" : 
						(num >= 80) ? "B" :
						(num >= 70) ? "C" : "F";
		
		System.out.println(result);
		
		String result2 = "";
		
		if(num >= 90) {
			result2 = "A";
		}else if(num >= 80) {
			result2 = "B";
		}else if(num >= 79) {
			result2 = "C";
		}else {
			result2 = "F";
		}			
		System.out.println(result2);
		

	}

}
