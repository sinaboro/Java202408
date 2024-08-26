package ex07;

public class Main {

	public static void main(String[] args) {
		
		ClassC c = new ClassC(10,20,30);
		
		c.info(); // 10 20 30 출력
		
		func(new ClassA());
		func(new ClassB());
		func(new ClassC());
		
		
	}
	
	static void func(ClassA a) {
		
//		ClassA a0 = new ClassA();
//		ClassA a1 = new ClassB();
//		ClassA a2 = new ClassC();
		System.out.println();
		if(a instanceof ClassB) {
			System.out.println("aaa");			
		}
	
	}

}
