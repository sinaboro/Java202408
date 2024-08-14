package ex02;

public class 논리연산자 {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		
		System.out.println((num1 == num2) && (num1 != num2) );
		
		System.out.println((num1 == num2) || (num1 != num2) );
		
		System.out.println( !((num1 == num2) && (num1 != num2)) );
		
		

	}

}
