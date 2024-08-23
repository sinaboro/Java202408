package ex06;

public class Car extends Vehicle{

	String fuelType; // (연료 타입: 예를 들어, "Gasoline" 또는 "Diesel")
	int seatingCapacity; //탑승 인원
	
	public Car(String licensePlate, String owner,
			String fuelType, int seatingCapacity) {
		
		super(licensePlate, owner);		
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
		
	}
	
	@Override
	//정비 비용 계산 메소드 구현 : 답승인원당 10000만
	double calculateMaintenanceCost() {
		return seatingCapacity* 10000.0;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("연료 타입 : " + fuelType);
		System.out.println("탑승 인원 : " + seatingCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
}
