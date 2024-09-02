package ex09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

class Num{
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() {	
//		return   num + ""; // 10 + "" => "10"
		return String.valueOf(num); //10 => "10"
	}
}

public class HashSet03 {

	public static void main(String[] args) {
		//출력 => Iterator
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(30));
		set.add(new Num(10));		
		
		Iterator<Num> itr = set.iterator();  //반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------------");
		
		itr = set.iterator();  //반복자 획득
		 
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
	}

}
