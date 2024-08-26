package ex02;

public class MainUser {

	public static void main(String[] args) {
		
		TV tv = new LgTV();
		
		tv.powerOn();
		
		tv.soundUp();
		tv.soundUp();
		tv.soundUp();
		
		tv.soundDown();
		
		
		tv.powerOff();

	}

}
