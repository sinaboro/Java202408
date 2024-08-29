package ex02;

import java.util.Scanner;

class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}	
}



public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();  //사과담는 박스
		Box oBox = new Box(); //오렌지 담는 박스
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj(); //형변환해야하는 불편함..
		
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
//		Scanner sc = new Scanner("System.in");
//		int num = sc.nextInt();
		
		aBox.setObj("new Apple()");
		
//		Apple ap2  = (Apple)aBox.getObj();
		
		System.out.println(aBox.getObj() );
		
		
		
	}

}

















