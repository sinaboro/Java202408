package ex04;

public class Dog extends Animal{
	private int age;
	
	public Dog() {	
	}
	
	Dog(String name, int age){
		super(name);
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	@Override  //상위클래스 가지고 있는 메소드 재정의
	void info() {
//		System.out.println(getName() + " 입니다.");
		super.info();
		System.out.println(age + "살 입니다.");
	}
	
	@Override
	void speak() {
		System.out.println("멍멍~");
	} 
}
