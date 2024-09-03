package ex06;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/*
 * 숫자 2개 전달하면 최대값 반환!
 */
public class Exam07 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> biFunction = (n1,n2) -> String.valueOf("" + n1 + n2 );
		
		
		String str = biFunction.apply(10, 20);
		System.out.println(str);
	}
}










