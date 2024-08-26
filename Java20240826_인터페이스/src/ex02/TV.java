package ex02;

interface TV {
	
	int MAX  = 100; //public final
		
 	void powerOn();  //abstract public
 	void powerOff();
 	void soundUp();
 	void soundDown();
 	
 	//채널 변경 추가
 	default void channelUp() {};
 	
 	default void channelDown() {};
	
}
