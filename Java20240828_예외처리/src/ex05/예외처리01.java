package ex05;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		//try => 문제가 될 소지가 있는 경우 try{} 블럭안 기입
		//catch => 예외(문제)가 발생하면 처리하는 블럭
		try {
			int num = 6/1;		
			System.out.println();
			System.out.println();
			System.out.println();
		}catch(Exception e) {
			System.out.println("그 외 예외 처리구문");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			System.out.println("예외가 발생하든 발생하지 않든 무조건 처리하는 문장!!");
		}
		//
		System.out.println("결과는 " + sum);
		
		System.out.println("프로그램 종료!!!!");

	}

}
