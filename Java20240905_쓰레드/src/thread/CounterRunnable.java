package thread;

import static util.MyLogger.log;

public class CounterRunnable implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				log("value : " + (i+1));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
