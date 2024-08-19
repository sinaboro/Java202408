package ex01;

public class Break {

	public static void main(String[] args) {
		
		//1~100 -> 100연산 후 5050;
		
		//1~10000회전 => 1,000,000 -> 연산 횟수
		
		int i, sum, count;
		sum = i = count = 0;
		
		for( ; i<10000; ) {			
			
			if(sum > 1000000) break;
			
			sum +=i;
			count++;
			i++;			
		}
		
		System.out.printf("sum : %d, count: %d\n", sum, count);
		
	}

}
