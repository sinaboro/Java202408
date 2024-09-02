package ex01;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "Aclass";
	}
}

public class ArrayList01 {

	public static void main(String[] args) {
		
		//타입 제한 없으면 list에는 모든 객체 입력 가능
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(new Integer(20));
		list.add("kor");
		list.add(new A());
		
		for(Object obj : list)
			System.out.print(obj + " ");
	}

}
