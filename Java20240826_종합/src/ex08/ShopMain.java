package ex08;

public class ShopMain {
	public static void main(String[] args) {
		 Item item = new Book("JAVA", 10000, "han", "12345");
		 Item item2 = new Album("앨범1", 15000,"seo");
		 Item item3 = new Movie("영화1", 18000,"감독1", "배우1");
		
		 item.print();
		 item2.print();
		 item3.print();
		 
		 int sum = item.getPrice() + item2.getPrice() + item3.getPrice();
		 
		 System.out.println("상품 가격의 합: " + sum);
	 }
}
