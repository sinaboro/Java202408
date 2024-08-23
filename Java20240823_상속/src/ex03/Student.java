package ex03;


//final class Student => Student 클래스 상속불가.
//public final class Student extends Person{
public class Student extends Person{

	String school;
	String stduentID;  //학번
	
	public Student() {}
	
	public Student(String school, String stduentID) {
//		this("kim",10, school, stduentID);
		this.school = school;
		this.stduentID = stduentID;
	}
	
	//super(name, age, school, studentID);	
	public Student(String name, int age,String school, String stduentID) {
		super(name, age);  //상위클래스(Person) 생성자 호출 구문
		this.school = school;
		this.stduentID = stduentID;
	}
	
	
	@Override  //@:어노테이션, @Override --> 상위클래스 메소드를 하위클래스가 재정의했다.
	public void introduce() {
		super.introduce(); //오버라이딩한 상위클래스 메소드 호출
		System.out.printf("학교는 %s이고, 학번은 %s 입니다.\n", school, stduentID);
	}
	
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
}
