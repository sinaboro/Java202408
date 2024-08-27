package ex09;

//class A extends Object{
class A {
	String name;
	int age;
	public A() {}
	
	public A(String name, int age) {
		this.name = name;
		this.age = 20;
	}
	void func() {
		
	}
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
	
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString() {
//		return "이름 : ," + name + " 나이 : " + age;
//	}
	
	void fa() {
		System.out.println("AAAAAAAA");
	}
}

class B extends A{
	@Override
	void fa() {
		System.out.println("BBBBBB");
	}
}

class C extends B{
	@Override
	void fa() {
		System.out.println("CCCCCCCCC");
	}
}

public class TestEx01 {

	public static void main(String[] args) {
		
		Object obj = new A("홍길동", 20);		
		System.out.println(obj);
		
		System.out.println("-----------------------");
		
		A a = new C();
		a.fa();
		
		B b = (B)a;
		b.fa();		
		((B)a).fa();
		
		

	}

}
