package ex03;

public class CreditCardPayment implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.printf("신용카드로 %.2f원을 결제합니다.\n",amount);
	}

}
