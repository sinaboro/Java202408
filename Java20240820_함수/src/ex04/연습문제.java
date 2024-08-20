package ex04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		/*
		 *  1.과목등록 | 2.과목목록보기 | 3.종료
		 *  String 배열을 이용해서 작업하기(배열 크기는 최대10)
		 */	
		String[] name = new String[10];
		int index = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("1.과목등록 | 2.과목목록보기 | 3.종료");
			System.out.println("번호입력>>");
			
			//int num = Integer.parseInt(sc.nextLine());
			int num = sc.nextInt();			
			sc.nextLine();  //엔터제거
			
			switch(num) {
			case 1:
				System.out.println("과목명입력>>");
				name[index++] = sc.nextLine();
				//name[index] = sc.nextLine();
				//index++;
				break;
			case 2:
				for(int i=0; i<index; i++) 					
					System.out.print(name[i] + ", ");				
				System.out.println();
				break;
			case 3:
				flag = false;
				break;
			}
		}
		System.out.println("프로그램 종료!");
	}

}



