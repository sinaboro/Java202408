package ex01;

public class Account {

	private int balance;
	
	public Account() {		
	}
	
	void deposit(int amount){
		balance += amount;
	}
	
	void withdraw(int amount){
		
		if(balance > amount) {
			balance -= amount;
		}else {
			System.out.println("잔액부족");
		}	
	}
	
	int getBalance() {
		return balance;
	}
}
