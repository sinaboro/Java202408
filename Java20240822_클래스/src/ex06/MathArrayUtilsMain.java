package ex06;

public class MathArrayUtilsMain {
	public static void main(String[] args) {
		
		int[] values = {1, 2, 3, 4, 5};
		
		 System.out.println("sum=" + MathArrayUtils.sum(values));
		 System.out.println("average=" + MathArrayUtils.average(values));
		 System.out.println("min=" + MathArrayUtils.min(values));
		 System.out.println("max=" + MathArrayUtils.max(values));
	}
}

/*
 * sum=15
	average=3.0
	min=1
	max=5
 */
