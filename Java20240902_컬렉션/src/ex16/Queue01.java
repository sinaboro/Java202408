package ex16;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue01 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> ts = new TreeSet<Integer>();
		List<Integer> ck = new Stack<Integer>();
		
		/*
		 * Queue는 인터페이스이다. 따라서 객체 생성을 할 수 없다
		 * Queue를 사용하기 위해서는 Queue를 구현하든가, 아니면 구현된 객체를 사용하면된다.
		 */
		Queue<Integer> qu = new  ArrayDeque<Integer>();
		
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.poll());
	}
}



















