package ex03;

public class 조건연산자2 {

	public static void main(String[] args) {
		
		// 국어점수가 70이고 영어점수가 70이상이면  합격, 불합격
	
		// 국어점수가 70이거나 영어점수가 70이상이면  합격, 불합격
		
		int kor = 0;
		int eng  = 75;
		
//		String result = ( kor >= 70 && eng >= 70 ) ? "합격" : "불합격";
		
		String result = ( kor >= 70 || eng >= 70 ) ? "합격" : "불합격";
		
		System.out.println(result);
				
				

	}

}
