package util;

import static util.MyLogger.log;

public class ThreadUtils {
	
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {
			log("인터렙트 발생, " + e.getMessage());
			throw new RuntimeException();
		}
	}
}
