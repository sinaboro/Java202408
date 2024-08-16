package ex01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//시작값에서 끝값까지 반복한다. 1  ~ 100 반복한다고 할때 2
		//  초기값     끝값   증가값(감소)
		// 초기값 -> 끝값(조건) -> 문장 -> 증가
		
//		for(int i=0; i<=5; i++) {
//			sum += i;   //문장  sum = sum+i
//		}
		
		//1~10까지 합
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
		
		//1~10까지에서 짝수 합 >> 30
		for(int i=0; i<=10; i+=2 ){  //i=i+2
			sum += i;
		}
		
		System.out.println("sum = " + sum);

	}

}
