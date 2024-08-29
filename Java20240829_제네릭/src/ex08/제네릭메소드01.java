package ex08;

class Box<T> { 
	private T obj;

	public T getObj() { return obj;	}
	public void setObj(T obj) { this.obj = obj;	}
}

class BoxFactory{
	//제네릭메소드
	public static <T extends Number> Box<T> markBox(T o){  //Integer, Long, Double,.....
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭메소드01 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = BoxFactory.markBox(new Integer(1000));
		Box<Double> dBox = BoxFactory.markBox(new Double(15.25));

		Box<Integer> i = BoxFactory.markBox(10);
		
		int i2 = i.getObj();
		System.out.println(i2);

	}

}
