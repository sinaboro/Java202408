package ex02;

/*
 * 오버라이딩(Overriding) --> 상속
 * 오버로딩(OverLoading) : 매개변수 다른 같은 이름 함수
 */
public class OverLoading {

	public static void main(String[] args) {
		func();
		func(5);
		func(5,2);
		func("abc");
	}
	
	static void func() {}
	static void func(int i) {}
	static void func(int i, int j) {}
	static void func(String s) {}

}
