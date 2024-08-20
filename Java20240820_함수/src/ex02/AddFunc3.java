package ex02;

public class AddFunc3 {

	public static void main(String[] args) {
		
		//정수 값 10넘겨주면 함수에서 1~10까지 평균 리턴시킨다.
		
		double result = func(100);
		
		System.out.println(result);
		
		
		int num = 10; //기본자료형
		
		int[] nArr = {1,2,3,4,5}; //참조형
	}
	
	static double func(int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum += i;
		
		return (double)sum/n;
	}

}
