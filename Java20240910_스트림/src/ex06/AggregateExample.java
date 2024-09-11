package ex06;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] arr = {};
		
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수 : " + count);
		
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sum();
		System.out.println("총합 : " + sum);
		
	    OptionalDouble avg = Arrays.stream(arr)
		.filter(n->n%2==0)
		.average();
		
		
		
		
		
	}

}
