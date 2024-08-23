package ex06;

public class Truck extends Vehicle{
	double loadCapacity; // (적재 용량: 단위는 톤)
	
	public Truck(String licensePlate, String owner,
			double loadCapacity) {
		super(licensePlate, owner);
		this.loadCapacity = loadCapacity;
		
	}

	//calculateMaintenanceCost() 메서드를 오버라이드하여, 
	//적재 용량에 비례한 정비 비용을 계산합니다. 
	//예를 들어, 톤당 20000원의 정비 비용이 발생한다고 가정하세요.
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity*20000.0;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("적재 용량 : " + loadCapacity);
		System.out.println("정비 비용 : " + calculateMaintenanceCost());
	}
	
}
