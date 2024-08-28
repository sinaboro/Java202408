package test;

public class SaleTV extends TV {

	private int price;
	
	public SaleTV() {}

	public SaleTV(String model, int size, int channel,int price) {
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("판매 TV 채널 %d 번의 프로를 플레이 합니다.\n", getChannel());
	}

	public void sale() {
		System.out.println(getModel()+"모델의 상품을 판매합니다. " + String.format("%,d",price)+ "을 지불해 주세요.");
	}
	
	@Override
	public String toString() {	
		return "판매상품정보 : 모델명("+ getModel()+"), 가격("+ String.format("%,d",price) +"원), 크기("+getSize()+")";
	}	

}
