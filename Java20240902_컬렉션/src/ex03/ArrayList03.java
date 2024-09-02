package ex03;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
		
		//타입 제한 => String
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("kor");
		list.add("eng");
		list.add("math");
		list.add("com");
		
		for(int i=0; i<list.size(); i++) 
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(0);
		
		
		for(Object obj : list)
			System.out.print(obj + " ");
	}

}
