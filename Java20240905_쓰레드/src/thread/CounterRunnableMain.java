package thread;

import static util.MyLogger.log;

public class CounterRunnableMain {

	public static void main(String[] args) {
		
//		CounterRunnable runnable = new CounterRunnable();
		
		Thread thread = new Thread(
				
			 () -> {
						for(int i=0; i<5; i++) 
							log("value : " + (i+10));
					}				
				,				
				"counter");		
		thread.start();
	}

}
