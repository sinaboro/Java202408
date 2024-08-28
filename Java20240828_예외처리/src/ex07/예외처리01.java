package ex07;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {
		
		try {
			func(10,0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료!!");
	}
	
	static void func(int n1, int n2) throws Exception{
		//함수에서 예외 발생하면 내부에서 처리하지 않음!
		
		int result = 0;
		
		result =  n1/n2;
		
		
		System.out.println("result = " +result);
	}

}
