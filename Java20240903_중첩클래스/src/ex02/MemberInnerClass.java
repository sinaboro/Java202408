package ex02;

/*
 * 멤버이너클래스
 */
class Outer {
	
	private int num=0;  //인스턴스 변수
	
	class Member{
		void add(int n) { num = n; }
		int get() { return num; }
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		Outer outer1 = new Outer();
		Outer outer2 = new Outer();
		
		Outer.Member outer1M1 = outer1.new Member();
		Outer.Member outer2M2 = outer2.new Member();
		
		outer1M1.add(5);
		System.out.println(outer1M1.get());
		
		outer2M2.add(9);
		System.out.println(outer2M2.get());
		
	}
}

















