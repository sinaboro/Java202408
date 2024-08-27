package mobile;

public class Ltab extends Mobile{

	public Ltab() {}
	
	public Ltab(String mobileName,
			int batterySize,String osType ) {
		super(mobileName, batterySize, osType);
	}
	
	@Override  //잔량 100  => 2분 20
	public void operate(int time) {		
		int tmp = getBatterySize() - time*10;		
		setBatterySize(tmp);		
	}

	@Override
	public void charge(int time) {		
		setBatterySize( getBatterySize() + time*10 );
	}
}
