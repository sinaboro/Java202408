package ex03;

class Student{	//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	
	private String name;
	private int age;
	private String phone;
	
	Student(String name, int age, String phone ){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	//디폴트 생성자
	Student(){
//		name = "한라산";	
//		age = 10;
//		phone="000-0000-0000";
		this("한라산", 10,"000-0000-0000"); //다른 생성자 호출
		System.out.println("디폴트 생성자 호출");
	}
	
	Student(String n){
//		name = n;	
//		age = 10;
//		phone="000-0000-0000";
		this(n, 10,"000-0000-0000");
	}
	Student(String n, int a){
//		name = n;
//		age = a;
//		phone="000-0000-0000";
		this(n, a,"000-0000-0000");
	}
	
	
	
	void info() {
		System.out.printf("이름 : %s, 나이: %d, 전화번호:%s\n", 
				name, age, phone);
	}
	
	void 입실() {
		System.out.println("입실하다.");
	}
	
	void 퇴실() {
		 System.out.println("퇴실하다");
	}
	
	void 조퇴() {
		System.out.println("조퇴하다");
	}
}