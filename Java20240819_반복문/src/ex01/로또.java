package ex01;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		//로또 -> 5게임
		
		int[] lotto = new int[6];
		//(int)(Math.random()*45) +1
		//random.nextInt(45)+1
		
		Random random = new Random();
		
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<6; j++) {
				int tmp = random.nextInt(45)+1;
				boolean flag = false;
				
				for(int k=0; k<j; k++) {  //같은 숫자 중복체크
					if(lotto[k] == tmp) {
						flag = true;
						j--;
						break;
					}
				}
				
				if(flag == false) {
					lotto[j] = tmp;
					System.out.print(lotto[j] + ", ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
