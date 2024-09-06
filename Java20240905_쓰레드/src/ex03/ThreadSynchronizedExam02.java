package ex03;

class Counter{
	private int count=0;
	
	public synchronized void incremant() {
		count++;
	}

	public synchronized void decremant() {
		count--;
	}
	
	int getCount() { return count; }
}

public class ThreadSynchronizedExam02 {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		
		Runnable task1 = ()-> {
			for(int i=0; i<=1000; i++)
				counter.incremant();
		};
	
		Runnable task2 = ()->{
			for(int i=0; i<=500; i++)
				counter.decremant();
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("counter : " +   counter.getCount() );
		
	}

}











