package ex01;


public class ClassEx01 {

	public static void main(String[] args) {
		
		Student 철 = new Student();
		
//		철.나이 = 250;
//		철.이름 = "김대철";
//		철.전화번호 = "010-3380-6422";
		철.infoAge(200);
		철.info();
		
/*
 * 멤버변수는 외부 공개하지 않는다.
 * 그러면  
 * int a ;
 * a = 10;
 * System.out.println(a);  -> 즉 , a변수를 초기화해야 사용가능하다.
 * 마찬가지로 멤버변수를 반드시 초기화해야한다.
 * 초기화하는 방법은 2가지
 * 1. 생성자, 2.setter를 이용해서 멤버변수 초기화한다.
 */
		
		
		Student 동휘 = new Student();
//		동휘.나이 = -28;
//		동휘.이름 = "이동휘";
//		동휘.전화번호 = "000-1111-2222";
		동휘.info();
	}
}

/*private < default <  protected < public 
	private -> 같은 클래스 내에서만 공개
	default -> 같은 package내에서 공개
	protected -> 다른 package에서도  상속하면 공개
	public -> 모두 공개
*/

class Student{	//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	
	private String 이름;
	private int 나이;
	private String 전화번호;
	
	
	void infoAge(int age) {
		if(age>0 && age<120) {
			나이  = age;
		}else {
			System.out.println("나이는 0~ 120세 사이만 입력가능");
		}
	}
	
	void info() {
		System.out.printf("이름 : %s, 나이: %d, 전화번호:%s\n", 
				이름, 나이, 전화번호);
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

