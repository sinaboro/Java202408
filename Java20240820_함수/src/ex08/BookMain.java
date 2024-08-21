package ex08;
/*
 * 도서 클래스
	필드
	제목
	저자
	가격
	재고수량
	
	메소드
	판매()
	입고()
	총판매금액()
	info() //제목,저자, 가격, 재고수량
 */
public class BookMain {

	public static void main(String[] args) {
	
		Book 자바 = new Book();		
		자바.제목 = "이것이 자바다";
		자바.저자 = "신용균";
		자바.가격 = 25000;
		자바.재고수량 = 100;
		
		자바.판매(50);
		자바.입고(30);
		자바.판매(20);
		자바.총판매금액();
		자바.info();

	}
}

class Book{
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
	int 판매누적수량;
	
	void 판매(int stock) {
		재고수량 -= stock;
		판매누적수량 += stock;
	}
	void 입고(int stock) {
		재고수량 += stock;
	}
	void 총판매금액() {
		System.out.println("총판매금액 : " + 판매누적수량 * 가격);
	}
	void info() {
		System.out.printf("제목 : %s, 저자: %s, 가격:%d, 재고수량: %d, 판매누적수량: %d\n",
				제목, 저자, 가격, 재고수량, 판매누적수량);
	}
}










