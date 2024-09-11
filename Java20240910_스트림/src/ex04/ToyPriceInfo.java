package ex04;

class ToyPriceInfo{
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
}