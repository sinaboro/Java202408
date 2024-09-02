package ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class Stack01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.add(60);
		stack.add(1, 70);
		stack.push(40);
		stack.push(50);
		
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		
		/*System.out.println(stack.size());
		for(int i=0; i<stack.size(); i++) {			
			System.out.printf("peek:%d, %d\n",stack.peek(), stack.pop());
		}*/
			
		
//		Iterator<Person> itr = set.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
	}
}



















