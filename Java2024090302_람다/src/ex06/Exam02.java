package ex06;

//매개변수있고, 반환형 있는 경우
@FunctionalInterface //-> 인터페이스 추상메소드 1개 존재
interface MaxInterface2{
	void max(int num1, int num2);
	
	public static void func() {};
	default void func2() {}
}

public class Exam02 {

	public static void main(String[] args) {
		
		
		//익명
		MaxInterface2 max = new MaxInterface2() {
			@Override
			public void max(int num1, int num2) {
				int max = (num1 >num2) ? num1: num2;
				System.out.println("최대값 : " + max );
			}
		}; 

		//람다
		MaxInterface2 max2 =			
			 (num1, num2) -> {
				int n = (num1 >num2) ? num1: num2;
				System.out.println("최대값 : " + n );
		}; 
				
		max.max(6, 10);
		max2.max(1,2);
		
	}

}
