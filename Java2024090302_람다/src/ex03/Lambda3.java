package ex03;

interface Printable{
	void print(String msg);  //추상메소드
//	void print2(String msg);  //추상메소드 1개 이상이면 람다는 사용 불가
	
	public static void print2() {}; //정적메소드 람다하고는 상관없음
	default void print3() {};  //default 메소드는 람다하고 상관없음
}

/*
 * 람다 
 * 1. 추상메소드가 1개만 존재해야 람다를 생성가능.
 * 2. 매개변수 자료형 삭제 가능
 * 3. 매개변수가 1개 일 때는 괄호 삭제가능
 * 4. 함수 몸체안 문장이 1개면 중괄호 생략 가능 
 */
public class Lambda3 {

	public static void main(String[] args) {

		Printable p = msg -> System.out.println(msg);
		p.print("이 문장 출력 요망!!");
	}

}
