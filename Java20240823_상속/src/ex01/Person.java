package ex01;

//사람 클래스
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
}
