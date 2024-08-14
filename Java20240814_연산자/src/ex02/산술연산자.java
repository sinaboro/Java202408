package ex02;

public class 산술연산자 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 7;
		
		int 더하기  = num1 + num2;
		int 빼기  =  num1 - num2;
		int 곱하기  =  num1 * num2;
		double 나누기  =  num1 / (double)num2;

		int 나머지  =  num1 % num2;
		
		System.out.println(더하기);
		System.out.println(빼기);
		System.out.println(곱하기);
		System.out.println(나누기);
		
		System.out.printf("%d\n" , 곱하기);  //%d 십진 정수
		System.out.printf("%x\n" , 곱하기);  //%d 16진수 정수
		System.out.printf("%o\n" , 곱하기);  //%d 8진수 정수
		
		System.out.printf("%f\n" , 나누기);  //%f 실수 출력
		System.out.printf("%.3f\n" , 나누기);  //%f 실수 출력
		
		System.out.println(나머지);
		System.out.println("--------------------------------");
		
		int num3 = 12;
		int num4 = 123;
		int num5 = 1234;
		int num6 = 12345;
		System.out.println(num3 + " , " +num3 );
		System.out.println(num4 + " , " +num4 );
		System.out.println(num5 + " , " +num5 );
		System.out.println(num6 + " , " +num6 );
		System.out.println("--------------------------------");		
		System.out.printf("%d , %d\n", num3, num3);
		System.out.printf("%d , %d\n", num4, num4);
		System.out.printf("%d , %d\n", num5, num5);
		System.out.printf("%d , %d\n", num6, num6);
		
		System.out.println("--------------------------------");		
		System.out.printf("%5d , %5d\n", num3, num3);
		System.out.printf("%5d , %5d\n", num4, num4);
		System.out.printf("%5d , %5d\n", num5, num5);
		System.out.printf("%5d , %5d\n", num6, num6);
		
		System.out.println("--------------------------------");		
		System.out.printf("%-5d , %5d\n", num3, num3);
		System.out.printf("%-5d , %5d\n", num4, num4);
		System.out.printf("%-5d , %5d\n", num5, num5);
		System.out.printf("%-5d , %5d\n", num6, num6);
		
		System.out.println("--------------------------------");		
		
		//byte -128 ~ 127
		byte b = -128;
		--b;
		
		System.out.println(b);
	}

}
