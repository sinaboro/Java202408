package ex06;

public class VehicleMain {

	public static void main(String[] args) {
		
		/*
		 * 차량 번호: 123가 4567
			소유자: 홍길동
			차량이 시동을 걸었습니다.
			연료 타입: Gasoline
			탑승 인원: 5
			정비 비용: 50000.0원
		 */
		
		Vehicle car = new Car("123가 4567", "홍길동", "Gasoline", 5);
		
		car.printInfo();
		System.out.println("-------------");
		/*
		 * 차량 번호: 789나 1011
			소유자: 이순신
			차량이 시동을 걸었습니다.
			적재 용량: 10.0톤
			정비 비용: 200000.0원
		 */
		Vehicle truck = new Truck("789나 1011", "이순신", 10);
		truck.printInfo();

	}

}
