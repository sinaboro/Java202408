package ex14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class Person implements Comparable<Person>{
	private int age;
	public Person(int age) { this.age = age; }
	public String toString() {
		return  String.valueOf(age); //age + "";
	}
	
	@Override
	public int compareTo(Person o) {
		/*
		if( this.age == o.age)
			return 0;
		else if(this.age > o.age)
			return 1;
		else 
			return -1;
		*/
//		return this.age - o.age; //오름차순 정렬
		return o.age - this.age ; //내림차순 정렬
	}
	
}

public class TreeSet03 {

	public static void main(String[] args) {
		
		//TreeSet ==> 중복안되고 => 자동 정렬(오름차순 정렬)
		// >>> 사용자 만든 클래스는 중복(X), 정렬(X)
		Set<Person> set = new TreeSet<>();
		
		set.add(new Person(10));
		set.add(new Person(20));
		set.add(new Person(30));
		set.add(new Person(35));
		set.add(new Person(22));
		set.add(new Person(35));
		set.add(new Person(10));
		
		Iterator<Person> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}



















