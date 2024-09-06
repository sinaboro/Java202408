package thread;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": run()");
	}

}
