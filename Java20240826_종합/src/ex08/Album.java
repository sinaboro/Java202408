package ex08;

public class Album extends Item{
	private String artist;
	
	public Album(String name,int price, String artist) {
		super(name,price);
		this.artist = artist;
	}
	
	@Override
	void print() {
		super.print();
		System.out.printf("- 아티스트:%s\n", artist);
	}
}
