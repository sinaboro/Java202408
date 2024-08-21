package ex07;

/*
 * 은행계좌 클래스
	필드
	계좌번호
	소유자이름
	잔액
	
	메소드
	입금()
	출금()
	잔액()
	info() //계좌번호, 이름, 잔액
 */
public class BankMain {

	public static void main(String[] args) {
		
		BankClass b1 = new BankClass();
		
		b1.계좌번호 = "111-2222-3333";
		b1.소유자이름 = "길동이";
		b1.입금(10000);
		b1.출금(3000);
		b1.잔액();
		b1.info();
		
		BankClass b2 = new BankClass();
	}
}


class BankClass{
	String 계좌번호;
	String 소유자이름;
	int 잔액;
	
	void 입금(int money) {
		잔액 += money;
		System.out.println("입금 : " + money);
	}
	void 출금(int money) {
		잔액 -= money;
		System.out.println("출금 : " + money);
	}
	void 잔액() {
		System.out.println("현재 잔액 : " + 잔액);
	}
	
	void info() {
		System.out.printf("계좌번호 : %s, "
				+ "소유자이름: %s, 잔액 : %d\n",
				계좌번호, 소유자이름, 잔액);
	}
}