package thread;

public class HelloRunanableMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " main() start");
		
		HelloRunnable helloThread = new HelloRunnable();
	
		Thread thread = new Thread(helloThread);
		
//		Thread thread = new Thread( () -> {
//			System.out.println(Thread.currentThread().getName() + ": run()");
//		});
//		
		thread.start();		
		
		System.out.println(Thread.currentThread().getName() + " main() end");
	}
}
