package ex03;

//사람 클래스
public class Person {
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	final -> 하위클래스에서 introduce() 메소드 재정의 허용하지 않겠다.
//	public final void introduce() { 
	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
	
}
