package ex05;

public class 복습 {

	public static void main(String[] args) {
	
		 int age = 14;
		 
		 if(age <= 7) { //~7: 미취학
			 System.out.println("미취학");			 
		 } else if(age <= 13) {   //8~13: 초등학생			 
			 System.out.println("초등학생");			 
		 } else if(age <= 16) { //14~16: 중학생
			 System.out.println("중학생");
		 } else if(age <= 19) { //17~19: 고등학생
			 System.out.println("고등학생");
		 } else { //20~: 성인
			 System.out.println("성인");
		 }
			

	}

}
