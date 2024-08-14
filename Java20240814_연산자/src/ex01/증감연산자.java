package ex01;

public class 증감연산자 {

	public static void main(String[] args) {
		
		//증감 연산자 => 선위연산자, 후위연산자
		
		int num = 0;
		
		//num = num +1;  //num = 1+num;
		++num;   //선위
		num++;   //후위
		
		System.out.println(num);

	}

}
