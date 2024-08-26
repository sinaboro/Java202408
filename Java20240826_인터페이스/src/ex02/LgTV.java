package ex02;

public class LgTV implements TV{

	boolean power;
	int sound;
	
	@Override
	public void powerOn() {
	  this.power = true;
	  System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {
	  this.power = false;      
      System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void soundUp() {
		 this.sound +=1;		
	}

	@Override
	public void soundDown() {
		 this.sound -=1;
	      if (sound <0)
	         sound = 0;
	}

	
}
