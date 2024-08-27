package mobile;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {}
	
	public Mobile(String mobileName,
			int batterySize,String osType ) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public abstract void operate(int time);
	public abstract void charge(int time);
	
	String getMobileName() {
		return mobileName;
	}
	
	int getBatterySize() {
		return batterySize;
	}
	
	String getOsType() {
		return osType;
	}

	void setMobileName(String mobileName) {
		this.mobileName =  mobileName;
	}
	
	void setBatterySize(int batterySize) {
		this.batterySize =  batterySize;
	}
	
	void setOsType(String osType) {
		this.osType =  osType;
	}
}
