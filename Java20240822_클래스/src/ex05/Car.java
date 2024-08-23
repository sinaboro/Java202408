package ex05;

public class Car {

	String model;
	static int count;
	
	Car(){}
	Car(String model){
		this.model = model;
		++count;
		//System.out.println("차량 구입, 이름: " + this.model);
	}
	
	void infoCar() {
		System.out.println("차량 구입, 이름: " + this.model);
	}
	static void showTotalCars() {
		System.out.println("구매한 차량 수 : " + count);
	}
}
