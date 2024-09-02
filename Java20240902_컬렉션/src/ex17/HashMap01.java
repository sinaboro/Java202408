package ex17;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		
		// key : 중복X, value:중복OK
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"kim");
		map.put(2,"park");
		map.put(3,"hong");
		map.put(4,"Lee");
		map.put(4,"cho");
		map.put(3,"sujin");
		map.put(1,"park");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
	}

}
