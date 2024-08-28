package test2;

class A{
	void funcA() {
		System.out.println("AAA");
	}
	void funcB() {
		System.out.println("A");
	}
}

class B extends A{
	void funcB() {
		System.out.println("B");
	}
		
}
public class Main {

	public static void main(String[] args) {
		
		A a = new B();
		a.funcB();
	}

}
