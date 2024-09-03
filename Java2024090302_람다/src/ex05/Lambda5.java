package ex05;

interface Printable{
	void print();  //추상메소드
}

/*
 * 람다 
 * 1. 추상메소드가 1개만 존재해야 람다를 생성가능.
 * 2. 매개변수 자료형 삭제 가능
 * 3. 매개변수가 엾을 때 괄호 삭제불가
 * 4. 함수 몸체안 문장이 2개면 중괄호 생략 불가능 
 */
public class Lambda5 {

	public static void main(String[] args) {

		Printable p = () -> {
			System.out.println("인자값 없네1!!!");
			System.out.println("인자값 없네2!!!");
		};
		
		p.print();
	}

}
