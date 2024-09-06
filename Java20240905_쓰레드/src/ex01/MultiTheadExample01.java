package ex01;

public class MultiTheadExample01 {

	public static void main(String[] args) {

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=0; i<=20; i++) {
						if(i%2 == 0)
							System.out.print(i + " ");
//						Thread.sleep(1000);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};

		Runnable task2 = () -> {
							try {
								for(int i=0; i<=20; i++) {
									if(i%2 == 1)
										System.out.print(i + " ");
//									Thread.sleep(1000);
								}
							}catch(Exception e){
								e.printStackTrace();
							}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
	}

}
