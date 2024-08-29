package ex04;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<Tv, String>();

		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println("-------------------");
		Product<Car, Integer> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel(10);
		
		Car car = product2.getKind();
		Integer carModel = product2.getModel();
	}
}

/*
 *
 * public class Product<Tv,String> {

	private Tv kind;
	private String model;
	
	public Tv getKind() {
		return kind;
	}
	public void setKind(Tv kind) {
		this.kind = kind;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	-------------------------------------------
	
	public class Product<Car,Integer> {

	private Car kind;
	private Integer model;
	
	public Car getKind() {
		return kind;
	}
	public void setKind(Car kind) {
		this.kind = kind;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	
	
}
}
 */
