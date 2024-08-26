package ex03;

public class CashPayment implements Payment{

	@Override
	public void makePayment(double amount) {
		System.out.printf("현금으로 %.2f원을 결제합니다.\n",amount);
		
	}

}
