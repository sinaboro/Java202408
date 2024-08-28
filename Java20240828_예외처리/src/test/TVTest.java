package test;

public class TVTest {

	public static void main(String[] args) {
		
		//SaleTV, RentalTV 클래스 의 객체를 각각 생성한다
		SaleTV saleTV = new SaleTV("SALETV-1", 40, 1,300000);
		RentalTV rentalTV = new RentalTV("RENTALTV-10", 42, 1,100000);
		
		//SaleTV 객체는 채널을 두 개 높인다
		saleTV.channelUp();
		saleTV.channelUp();
		
		//RentalTV 객체는 채널을 세 개 내린다
		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();
		
		//각 객체에 대하여 printAllTV() 을 호출한다
		TVTest.printAllTV(saleTV);
		TVTest.printAllTV(rentalTV);
		
		TVTest.printRentalTV(rentalTV);

	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());		
		
		
		//tv가 SaleTV를 참조하거나, SaleTV를 상속한 객체
		//를 참조하니?
		if(tv instanceof SaleTV sale) {
			sale.play();
			sale.sale();
		}

		if(tv instanceof RentalTV rent)
			rent.play();
	}

	static void printRentalTV(Rentable tv) {
		if(tv instanceof RentalTV rent)
			rent.rent();
	}
}
