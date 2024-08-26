package ex08;

public class Book extends Item{
	private String author;
	private String isbn;
	
	public Book(String name,int price,String author,String isbn ) {
		super(name, price);
		this.author = author;
		this.isbn = isbn;		
	}
	
	@Override
	void print() {
		super.print();
		System.out.printf("- 저자:%s, isbn:%s\n", author, isbn);
	}
}
