package ex06;

import java.util.function.Function;

interface AAA {
	int doubleFunc(int num);
}

public class Exam03 {

	public static void main(String[] args) {
		
		AAA a = num -> num*num;
		System.out.println(a.doubleFunc(5));
		
		
		Function<Integer, Integer> function =  t -> t*t;
			
		System.out.println(function.apply(5));
		
		function.apply(10);
	}

}
