package ex08;

import ex01.Account;

public class SingletonExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		Account ac2 = new Account();
		System.out.println(ac == ac2);
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
	}

}
