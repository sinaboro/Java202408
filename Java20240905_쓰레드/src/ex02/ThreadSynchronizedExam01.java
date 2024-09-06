package ex02;

class Counter{
	private int count=0;
	
	public void incremant() {
		count++;
	}

	public void decremant() {
		count--;
	}
	
	int getCount() { return count; }
}

public class ThreadSynchronizedExam01 {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		for(int i=0; i<=100; i++)
			counter.incremant();

		for(int i=0; i<=100; i++)
			counter.decremant();
		
		System.out.println("counter : " +   counter.getCount() );
		
	}

}
