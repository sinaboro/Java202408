package ex02;

public class SamsungTV implements TV{

	private int sound = 0;
	private boolean isPower = false;
	   
	   @Override
	   public void powerOn()
	   {
	      isPower= true;
	      
	   }

	   @Override
	   public void powerOff()
	   {
	      isPower= false;
	      
	   }

	   @Override
	   public void soundUp()
	   {
	      sound++;
	      
	   }

	   @Override
	   public void soundDown()
	   {      
	      sound--;
	      if(sound <= 0)
	      {
	         sound = 0;
	      }
	   }
	   
	   public int getSound()
	   {
	      return sound;
	   }
	   
	   public boolean getPower() {
	      return isPower;
	   }	
}
