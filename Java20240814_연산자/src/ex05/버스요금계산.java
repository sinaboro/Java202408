package ex05;

/*
 * 버스 요금 계산 프로그램
	기본요금 : 2000;
	1~5세 : 무료
	6~12세 : 50%할인
	13~18세 : 25%할인
	19~64세 : 0%할인
	65이상 : 무료
	
	예> 25입력
	버스요금 : 2000원
 */
public class 버스요금계산 {

	public static void main(String[] args) {
		
		int age = (int)(Math.random()*100)+1;
				
		//System.out.println( (int)(Math.random()*100)+1 );
		
		int fee = 2000;
		double rate = 0;
		
		if(age >=65 || age<=5) {
			rate = 0;
		}else if(age >=6 && age <=12) {
			rate = 0.5;
		}else if(age>=13 && age <=18) {
			rate = 0.75;
		}else if(age>=19 && age <=64) {
			rate = 1;
		}
		
		int result = (int)(fee * rate);
		System.out.printf("나이 : %d, 버스 요금 : %d원\n", age, result);
	}

}
