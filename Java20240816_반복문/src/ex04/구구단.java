package ex04;

public class 구구단 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=9 ; i++) {
//			System.out.printf("2 X %d = %d\n", i, 2*i);			
//		}
//		System.out.println("------------------");
//		
//		for(int i=1; i<=9 ; i++) {
//			System.out.printf("3 X %d = %d\n", i, 3*i);			
//		}
//		System.out.println("------------------");
//		
//		for(int i=1; i<=9 ; i++) {
//			System.out.printf("4 X %d = %d\n", i, 4*i);			
//		}
		
		for(int i=2; i<=4; i++) {  //단
			
			for(int j=1; j<=9; j++) { //1~9
				System.out.printf("%d X %d = %d\n", i,j , i*j);
			}
			
			System.out.println("-------------------");
		}
		
		for(int i=0; i<5; i++){  //i => 0 =>1 => 2 =>3 => 4 => 5
			
			for(int j=0; j<=i; j++) {  //j =0  1 2 3 4
				System.out.print(" * ");
			}
			
			System.out.println();
		}

	}

}
