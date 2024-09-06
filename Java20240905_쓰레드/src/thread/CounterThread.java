package thread;

import static  util.MyLogger.log;
/*
 * 1. `Thread` 클래스를 상속받은 `CounterThread` 라는 스레드 클래스를 만들자.
	2. 이 스레드는 1부터 5까지의 숫자를 1초 간격으로 출력해야 한다. 앞서 우리가 만든 `log()` 기능을 사용해서 출
	력해라.
	3. `main()` 메서드에서 `CounterThread` 스레드 클래스를 만들고 실행해라.
	4. 실행 결과를 참고하자.
 */
public class CounterThread extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				log("value : " + (i+1));
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
