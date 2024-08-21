package ex06;

import java.util.Scanner;

public class ClassEx01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //객체생성
		
		Student 철 = new Student();
		철.나이 = 50;
		철.이름 = "김대철";
		철.전화번호 = "010-3380-6423";		
		철.info();
		
		Student 동휘 = new Student();
		동휘.나이 = 28;
		동휘.이름 = "이동휘";
		동휘.전화번호 = "000-1111-2222";
		동휘.info();

	}

}


class Student{	//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	
	String 이름;
	int 나이;
	String 전화번호;
	
	void info() {
		System.out.printf("이름 : %s, 나이: %d, 전화번호:%s\n", 
				이름, 나이, 전화번호);
	}
	
	void 입실() {
		System.out.println("입실하다.");
	}
	
	void 퇴실() {
		 System.out.println("퇴실하다");
	}
	
	void 조퇴() {
		System.out.println("조퇴하다");
	}
}

