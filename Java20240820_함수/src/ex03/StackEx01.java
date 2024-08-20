package ex03;

import java.util.Scanner;

public class StackEx01 {

	public static void main(String[] args) {
		
		Scanner sc2   =  func();
	
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		int n1 = 10;
		int n2 = 10;
		
		System.out.println( n1  == n2);
		System.out.println( s1  == s2);

	}
	
	static Scanner func() {
		Scanner sc = new Scanner(System.in);
		
		return sc;
	}

}
