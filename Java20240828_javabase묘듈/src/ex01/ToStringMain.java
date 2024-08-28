package ex01;

class A{
	int age=100;
	String name = "홍길동";
	
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
//	@Override
//	public String toString() {
//	
//		return "이름 : " + name + ", 나이: " + age;
//	}
}

public class ToStringMain {

	public static void main(String[] args) {
		
		Object obj = new A();
		
		System.out.println(obj.toString());
		System.out.println(obj);
	}

}
