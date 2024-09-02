package ex18;

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
public class HashSMap02 {
	public static void main(String[] args) {
			// key : 중복X, value:중복OK
			// >>> 순차 출력(반복문, iterator로 출력?????)
			
			Map<Integer, String> map = new HashMap<>();
			
			map.put(11,"kim");
			map.put(21,"park");
			map.put(32,"hong");
			map.put(43,"Lee");
			map.put(44,"cho");
			map.put(32,"sujin");
			map.put(17,"park");
			
			Set<Integer> set = map.keySet();  //key값만 리스트 저장
			
			for(Integer n : set)
				System.out.print(n + " ");
			System.out.println();
			System.out.println("------------------");
			
			for(Integer n : set)
				System.out.println(map.get(n));
			System.out.println("------------------");
			
			 Iterator<Integer> itr = set.iterator();
			 while(itr.hasNext()) {
				 System.out.println( map.get(itr.next()) );
			 }
			
	}
}

