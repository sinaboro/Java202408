package ex06;

import java.util.function.Supplier;

/*
 * 랜덤숫자 하나 뽑기
 */
public class Exam05 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () ->  {
			return (int)(Math.random()*45);
		};
		
		int result = supplier.get();
		
		System.out.println( result  );
	}

}
