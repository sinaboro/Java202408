package ex03;

public class Main {

	public static void main(String[] args) {
		
		Payment c = new CreditCardPayment();
		c.makePayment(1000);
		
		 c = new CashPayment();
		 c.makePayment(10000);
		 
		 c = new PayPalPayment();
		 c.makePayment(20000);
		 

	}

}
