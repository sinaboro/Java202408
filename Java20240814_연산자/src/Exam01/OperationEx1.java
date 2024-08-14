package Exam01;

/*
 * 클래스 이름은 OperationEx1 라고 적어주세요.
	1. num1 , num2 , num3 라는 이름의 세 개의 int 변수를 선언하고, 각각 12, 20, 35으로 초기화하세요.
	2. 세 변수의 합을 계산하고, 그 결과를 sum 이라는 이름의 int 변수에 저장하세요.
	3. 세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 double 변수에 저장하세요. 
	  평균 계산 시 소수점 1자리로 표시하세요.
	4. sum 과 average 변수의 값을 출력하세요
 */
public class OperationEx1 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 20;
		int num3 = 35;
		
		int sum = num1 + num2 +num3;
		double average = sum/3.0;
		
		System.out.printf("sum : %d, 평균 : %.1f\n", sum, average);

	}

}
