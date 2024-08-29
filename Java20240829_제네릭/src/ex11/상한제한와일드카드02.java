package ex11;

class A{}
class B extends A{}
class C extends B{}

class Box<T> { 
	private T obj;

	public T getObj() { return obj;	}
	public void setObj(T obj) { this.obj = obj;	}
	@Override
	public String toString() {
		return obj.toString();
	}
}

class BoxFactory{
	//Box<? extends Number> => 와일드 카드 상한 제한
	//=> box 대입할 수 있는 대상은 B거나 B하위클래스만 대입가능
	// 기능 ==> get만가능 ==> 호출
	public static void peekBox(Box<? extends B> box) {		
		System.out.println(box);
		box.getObj();
//		box.setObj(new C());
	}
}

public class 상한제한와일드카드02 {

	public static void main(String[] args) {

		Box<A> a = new Box();
		Box<B> b = new Box();
		Box<C> c = new Box();
		
//		BoxFactory.peekBox(a);
		BoxFactory.peekBox(b);
		BoxFactory.peekBox(c);
		
	}

}










