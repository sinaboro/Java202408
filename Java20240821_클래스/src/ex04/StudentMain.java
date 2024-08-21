package ex04;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();		
		s1.info();
		
		Student s2 = new Student("차은우", 30, "000-1111-2222");
		s2.info();
		s2.nameInfo();
		
		s2.nameChange("차우은");		
		s2.nameInfo();
		
		System.out.println( s2.getName() );
		s2.setName("차은우");
		
		
	}

}
