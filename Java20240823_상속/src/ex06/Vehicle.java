package ex06;

public class Vehicle {
	
	String licensePlate; // (차량 번호)
	String owner; // (소유자)
	
	public Vehicle(String licensePlate, String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}
	
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	//정비 비용을 계산하는 메서드
	double calculateMaintenanceCost() {
		return 0;
	}
	
	void printInfo() {
		System.out.println("차량 번호 : " + licensePlate);
		System.out.println("소유자 : " + owner);
		startEngine();
	}	
	
}



/*
 * 연습 문제: 차량 관리 시스템

문제 설명:
자동차 정비소에서 여러 종류의 차량을 정비하고 있습니다. 모든 차량은 공통적으로 차량 번호와 소유자를 가지고 있으며, 차량 종류에 따라 연료 타입, 탑승 인원, 그리고 정비 방법이 다릅니다. 차량 관리 시스템을 구현하여 다양한 차량에 대한 정보를 관리하고, 각 차량의 정비 비용을 계산하는 프로그램을 작성하세요.

요구사항:
Vehicle (차량)  이 클래스는 다음과 같은 필드를 포함해야 합니다:

String licensePlate (차량 번호)
String owner (소유자)
또한, 다음과 같은 메서드를 정의하세요:

void startEngine() (차량 시동을 거는 메서드): 일반 메서드로, "차량이 시동을 걸었습니다." 메시지를 출력합니다.
double calculateMaintenanceCost() (정비 비용을 계산하는 메서드): 각 차량의 정비 비용을 계산하여 반환하는 메서드입니다.
Car (승용차) 클래스와 Truck (트럭) 클래스를 Vehicle 클래스를 상속하여 구현하세요.

Car 클래스는 다음과 같은 필드를 추가로 포함합니다:

String fuelType (연료 타입: 예를 들어, "Gasoline" 또는 "Diesel")
int seatingCapacity (탑승 인원)
calculateMaintenanceCost() 메서드를 오버라이드하여, 탑승 인원에 비례한 정비 비용을 계산합니다. 예를 들어, 탑승 인원당 10000원의 정비 비용이 발생한다고 가정하세요.

Truck 클래스는 다음과 같은 필드를 추가로 포함합니다:

double loadCapacity (적재 용량: 단위는 톤)
calculateMaintenanceCost() 메서드를 오버라이드하여, 적재 용량에 비례한 정비 비용을 계산합니다. 예를 들어, 톤당 20000원의 정비 비용이 발생한다고 가정하세요.

메인 클래스에서 다형성을 활용하여 여러 차량의 정비 비용을 계산하고, 차량 정보를 출력하는 프로그램을 작성하세요.

예시 출력:

코드 복사
차량 번호: 123가 4567
소유자: 홍길동
차량이 시동을 걸었습니다.
연료 타입: Gasoline
탑승 인원: 5
정비 비용: 50000.0원

차량 번호: 789나 1011
소유자: 이순신
차량이 시동을 걸었습니다.
적재 용량: 10.0톤
정비 비용: 200000.0원
 */
