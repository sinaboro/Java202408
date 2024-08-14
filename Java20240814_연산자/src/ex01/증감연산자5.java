package ex01;

public class 증감연산자5 {

	public static void main(String[] args) {
		
		//증감 연산자 => 선위연산자, 후위연산자
		
		int num = 10;
		
		int n1 = 0;
		
		//n1 = num--;
		n1 = num;
//		num = num-1;
		
		num -= 1; //num = num-1;
		
		System.out.println("n1 : " + n1);
		System.out.println("num : " + num);
		

	}

}
