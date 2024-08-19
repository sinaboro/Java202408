package ex01;

public class Continue2 {

	public static void main(String[] args) {
		
		//2의배수 |  3의배수 아닌 숫자만 출력(1~10사이)
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0 || i%3 == 0)  continue;
			
			System.out.print(i + ", ");
		}

	}

}
