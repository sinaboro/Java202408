package ex14;

public class Pair <K,M> {
	private K first;
	private M second;
	
	public K getFirst() {
		return first;
	}
	public void setFirst(K first) {
		this.first = first;
	}
	public M getSecond() {
		return second;
	}
	public void setSecond(M second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "Pair{first="+ first +", second="+ second + "}";
	}
	
}
