package ex02;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		//문자열 길이값 출력
		String[] arr = {"AA", "BBB", "CCCC", "DDDDD", "EEEEEE"};
		
		for(String str : arr) {
			System.out.print(str.length() + " ");
		}
		System.out.println();
		
		Arrays.stream(arr)
			.map(n-> n.length())
			.forEach(n-> System.out.print(n + " "));

		int total = Arrays.stream(arr)
				.mapToInt(n->n.length())
				.sum();
		
		System.out.println("\n" + total);
		
	}

}
