package ex01;

public class Student {

	private String name;
	private int age;
	private String school;
	private String stduentID;  //학번
	
	public Student(String name, int age, String school, String stduentID) {
		this.name = name;
		this.age = age;
		this.school = school;
		this.stduentID = stduentID;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, stduentID);
	}
	
	public void walk() {
		System.out.println(name + "이(가) 걷고 있습니다.");
	}
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
}
