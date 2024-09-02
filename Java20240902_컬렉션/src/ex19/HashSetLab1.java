package ex19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/*
 * 10 부터 30 까지의 숫자를 10개 추출하여 화면에 다음과 같이 출력하는 
	HashSetLab1 이라는 클래스를 구현한다.
	중복 숫자는 허용하지 않으며 추출되는 숫자를 HashSet 에 저장하여 처리한다.
	오늘의 로또 번호 : 10, 11, 25, 22, 20, 21, 15, 27, 28, 13
 */
public class HashSetLab1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		while(true) {
			set.add(random.nextInt(30)+1);
			if(set.size()>=10) break;
		}

		for(int n : set)
			System.out.print(n + " ");
	
	}
}


