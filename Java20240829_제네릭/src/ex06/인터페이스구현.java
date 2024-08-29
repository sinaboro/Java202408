package ex06;

interface Aable{};

class B implements Aable{};

class C {};

class Box<T extends Aable> { // T 전달은 인터페이스 Aabl구현 클래스만 전달가능!!
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) { //public void setObj(A obj)
		this.obj = obj;
	}
}

public class 인터페이스구현 {

	public static void main(String[] args) {
		
		Box<B> bBox = new Box();
		
//		Box<Integer> ibox = new Box();
//		Box<String> sbox = new Box();
		
//		Box<C> cbox = new Box(); error
	}

}



















