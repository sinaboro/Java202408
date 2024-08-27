package mobile;

public class Otab extends Mobile{
	
	public Otab() {}
	
	public Otab(String mobileName,
			int batterySize,String osType ) {
		super(mobileName, batterySize, osType);
	}
	
	@Override   
	public void operate(int time) {		
		int tmp = getBatterySize() - time*12;		
		setBatterySize(tmp);
	}

	@Override
	public void charge(int time) {		
		setBatterySize(getBatterySize() + time*8);
	}
}
