package ex03;


//학생 중 알바하는 학생
public class PartTimeStudent extends Student{

	String job;
	int pay;
	
	public PartTimeStudent() {
		
	}
	
	public PartTimeStudent(String name,int age, String school,
			String studentID, String job, int pay ){
		super(name, age, school, studentID);
		this.job = job;
		this.pay = pay;
	}
	
	public void work() {
		System.out.println("근무 중!");
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("%s에서 알바하며, 급여는 %d 입니다.\n", job,pay);
	}
}
