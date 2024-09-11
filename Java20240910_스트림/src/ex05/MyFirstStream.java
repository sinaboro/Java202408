package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		System.out.println(list);
		
		//대문자로 출력
		list.stream()
		.map(str-> str.toUpperCase())  //대문자 변환
		.forEach(n-> System.out.println(n));
		
		//대문자로 변환된 데이타를 리스트로 저장
		List<String> upperCaseNames = list.stream()
									.map(str->str.toUpperCase())
									.collect(Collectors.toList());
//									.toList();
		
//		upperCaseNames.add("FFFF");
		System.out.println(upperCaseNames);
		
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(arr);
		
		Arrays.stream(arr) 
		.filter(n-> n%2==0)
		.forEach(n->System.out.print(n + " "));
		System.out.println();
	    
		List<Integer> iList= Arrays.stream(arr) 
		.filter(n-> n%2==0)
		.boxed()
		.toList();		 //Arras.asList()
		System.out.println(iList);
		
//		iList.add(10);
//		iList.remove(0);
		System.out.println(iList);

		List<Integer> iList2 = Arrays.stream(arr) 
				.filter(n-> n%2==0)
				.boxed()
				.collect(Collectors.toList());	
		System.out.println(iList2);
		
		iList2.add(10);
		iList2.add(100);
		iList2.remove(0);
		System.out.println(iList2);
		
		
	}

}
