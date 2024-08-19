package ex02;

public class While예제 {

	public static void main(String[] args) {
		
		int sum = 0; 
		int i=101;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);

	}

}
