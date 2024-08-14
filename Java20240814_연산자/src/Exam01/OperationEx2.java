package Exam01;

/*
 * 문제2.
	클래스 이름은 OperationEx2 라고 적어주세요.
	num에는 4000을 입력하세요.
	4000을  시 분 초로 출력해주세요
	예> 1시간 6분 40초
 */
		
public class OperationEx2 {

	public static void main(String[] args) {
		
		int num = 4000;
		
		//시간 계산
		int hours = num / 3600;
		int remainingSeconds = num % 3600;
		
		//분 계산
		int minutes = 400 / 60;
		remainingSeconds = 400 % 60;
		
		System.out.printf("%d시간 %d분 %d초\n", hours, minutes, remainingSeconds);

	}

}
