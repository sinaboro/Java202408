package ex04;

import java.util.Scanner;

/*
 * 이클립스 단축키
 * 줄복사 : ctrl+alt + 상,하 방향키
 * 줄삭제 : ctrl+d
 * 줄이동 : alt + 방향키(상,하)
 * 창분할 : ctrl+ shift+ [           (토클기능)
 * 
 * 화면확대 : ctrl + m
 * 
 * 윈도우키+ shift + S --> 부분 캡쳐가능
 */
public class 중괄호블럭 {

	public static void main(String[] args) {
		 
		int kor;  //변수 선언
		
		kor = 100;
		
		System.out.println(kor);  //변수 사용
			
		{
			//블럭 안 내용은 불럭 내에서 만 사용가능
			int num = 10;
			System.out.println(num);
			System.out.println(kor);
		}
		
		
		{
			int num2 = 20;
			System.out.println(num2);			
			System.out.println(kor);			
		}
		
		{
			int num2 = 30;
			System.out.println(num2);
		}

		System.out.print("kor");
		System.out.print("kor\n");
		System.out.println("kor");
		System.out.println("kor");
		
		Scanner sc = new Scanner(System.in);
		
//		String line = sc.nextLine(); //아무거나 입력 가능
//		
//		System.out.println(line);
//		
//		int number = sc.nextInt(); //정수만 입력 가능
//		System.out.println(number);
		
		char num3 = 65;
		char num4 = 65;
		System.out.printf("%c %c\n", num3 , num4);
		
		System.out.println((char)(30  +   67));
		
	}

}
