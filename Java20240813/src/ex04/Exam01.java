package ex04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 >> ");
		int age  = sc.nextInt();
		System.out.println("나이는 : " + age);

		
		System.out.println("이름 입력 >> ");
		sc.nextLine();
		
		String name = sc.nextLine();
		System.out.println("이름은 : " + name);
		
		
	}

}
