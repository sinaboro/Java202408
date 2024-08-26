package ex08;

public class Item {
	
	private String name;
	private int price;
	
	public Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
	void print() {
		System.out.printf("이름:%s, 가격:%d\n", name, price);
	}
}
