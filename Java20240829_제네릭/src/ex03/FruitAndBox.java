package ex03;

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

class Box<T> {  //제네릭 기반의 클래스 정의
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}	
}



public class FruitAndBox {

	public static void main(String[] args) {
		/*
		Box aBox = new Box();
		aBox.setObj(new Apple());
		Apple ap = (Apple)aBox.getObj();
		System.out.println(ap);
		*/
		
		Box<Apple> aBox = new Box<Apple>();
		aBox.setObj(new Apple());
		Apple ap = aBox.getObj();
		System.out.println(ap);
//		aBox.setObj("new Apple()"); error
		
		Box<Orange> oBox = new Box<Orange>();
		oBox.setObj(new Orange());
		Orange op = oBox.getObj();
		System.out.println(op);
//		oBox.setObj(new Apple()); error
		
		Box<String> sBox = new Box();
		sBox.setObj("홍길동");
		String str = sBox.getObj();
		System.out.println(str);
		
//		sBox.setObj(new Apple()); error
	}

}

/*
 *  class Box {  //제네릭 기반의 클래스 정의
	private Apple obj;

	public Apple getObj() {
		return obj;
	}

	public void setObj(Apple obj) {
		this.obj = obj;
	}	
	--------------------------
	class Box {  //제네릭 기반의 클래스 정의
	private Orange obj;

	public Orange getObj() {
		return obj;
	}

	public void setObj(Orange obj) {
		this.obj = obj;
	}	
	
	-------------------------------
	class Box {  //제네릭 기반의 클래스 정의
	private String obj;

	public String getObj() {
		return obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}	
}
}
}
 */















