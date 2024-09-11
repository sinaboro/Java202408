package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<String>();
		list2.add("AA");		
		list2.add("BBB");		
		list2.add("CCCC");		
		list2.add("DDDDD");		
		list2.add("EEEEEE");	
		
		list2.remove(0);
		list2.add("FF");
		
		                     //수정 불가
		List<String> list = Arrays.asList("AA", "BBB", "CCCC", "DDDDD", "EEEEEE");
	/*	
		list = new ArrayList<>(list);
		list.remove(0);
		for(String str : list)
			System.out.print(str + " ");
	*/
		
		list.stream().map(n-> n.length())
		.forEach(n-> System.out.print(n + " "));
		
		int count = list.stream().mapToInt(n->n.length())
		.sum();
		System.out.println(count);
		
		
		
		
	}

}
