package ex04;

public class Cat extends Animal{
	int age;
	
	public Cat() {	
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	void info() {
		super.info();
		System.out.println(age + "살 입니다.");
	}
	
	@Override
	void speak() {
		System.out.println("야홍~");
	} 
	
	
}
