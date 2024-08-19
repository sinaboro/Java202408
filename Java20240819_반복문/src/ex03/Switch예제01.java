package ex03;

public class Switch예제01 {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*7); //0~4
		System.out.println("n : " + n);
	
		switch(n) {
		case 0:
			System.out.println("000");
			break;
		case 1:
			System.out.println("111");
			break;
		case 2:
			System.out.println("222");
			break;
		case 3:
			System.out.println("333");
			break;
		case 4:
			System.out.println("444");
			break;
		default:
			System.out.println("그 외 값");
		}
	}
}
