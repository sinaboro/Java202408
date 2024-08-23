package ex05;

public class SalesMan extends Person{

	private String company;
	private int salary;
	
	
	public SalesMan(String company, int salary) {
		this.company = company;
		this.salary = salary;
	}

	public SalesMan(String name, int age, String company, int salary) {
		super(name, age);
		this.company = company;
		this.salary = salary;
	}
	
//	public void introduce() {
//		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
//		System.out.printf("제 회사는 %s이고, 급여는 %d 입니다.\n", company, salary);
//	}
	

	public void work() {
		System.out.println(name + "이(가) 근무 중 입니다.");
	}
	
}
