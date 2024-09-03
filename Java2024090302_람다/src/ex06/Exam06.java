package ex06;

import java.util.function.Consumer;

/*
 * 숫자 전달하면 출력!
 */
public class Exam06 {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = num -> System.out.println(num);

		//메소드참조
		Consumer<Integer> consumer2 = System.out::println;
		
		consumer.accept(199);
		consumer2.accept(299);
	}
}
