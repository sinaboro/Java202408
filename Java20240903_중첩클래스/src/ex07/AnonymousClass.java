package ex07;

/*
 * 멤버로컬클래스 생성
 */
interface Printable{
	void print();
}


class Papers{
	
	private String message;
	public Papers(String message) { this.message = message; }
	
	public Printable getPrinter() {   //반환타입 : Printable -> Printable구현한 클래스만 반환한다.
		
//		Printable p = 이 자리 올 수 있는 대상은? => Printable 구현 클래스만 올 수 있다.
	
		/*
	   Printable p = 	new Printable(){

			@Override
			public void print() {
				System.out.println(message);
			}
			
		};
		return p;
		*/
		return new Printable(){  //익명 클래스
			@Override
			public void print() {
				System.out.println(message);
			}
		};
	}
}


public class AnonymousClass {

	public static void main(String[] args) {
		
		Papers papers = new Papers("이 문장을 출력해주세요");
		
		Printable p = papers.getPrinter();
		p.print();
		
	}
}

















