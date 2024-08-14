package ex05;

import java.util.Scanner;

/*
 * 문제 : 체질량지수

	사용자의 키와 몸무게를 입력받아, BMI(체질량지수)를 계산하고 
	그 결과에 따라 메시지를 출력하는 프로그램을 작성하세요.
	
	BMI = 몸무게(kg) / (키(m) * 키(m))
	BMI 18.5 미만: "저체중입니다."
	BMI 18.5 이상 24.9 이하: "정상 체중입니다."
	BMI 25 이상 29.9 이하: "과체중입니다."
	BMI 30 이상: "비만입니다."
 */
public class 체질량계산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키 입력(미터 단위) >> ");
		double height  = sc.nextDouble();
		
		System.out.println("몸무게 입력(킬로그램 단위) >> ");
		double weight  =sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if(bmi > 30) {
			System.out.println("비만입니다.");
		}else if(bmi > 25) {
			System.out.println("과체중입니다.");			
		}else if(bmi > 18.5) {
			System.out.println("정상 체중입니다.");
		}else {
			System.out.println("저체중입니다.");			
		}
		
	}

}
