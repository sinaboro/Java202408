package ex13;

public class Container <T> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	public boolean isEmpty() {
		return item == null;
	}
	
}
