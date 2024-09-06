package ex06;

import java.util.List;
import java.util.function.Predicate;

/*
 * 짝수 홀수 판별...람다식
 */
public class Exam04 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = num -> (num%2==0) ? true : false;

		Predicate<Integer> predicate2 = new Predicate<Integer>() {
				@Override
				public boolean test(Integer t) {
					return (t%2==0) ? true : false;
				}
		};
		
		int num=19;
		
		if(predicate.test(num)) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수");
		}
	}

}


