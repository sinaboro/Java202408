package thread;
import static util.MyLogger.log;

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		try {
			while(true) {
				log("A");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		try {
			while(true) {
				log("B");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadMain04 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new MyRunnable1(), "Thread-A");
		Thread thread2 = new Thread(new MyRunnable2(), "Thread-B");
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("main : " + Thread.currentThread().getState());
		thread1.start();
		thread2.start();
	}

}










