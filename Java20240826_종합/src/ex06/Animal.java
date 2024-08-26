package ex06;

abstract class Animal{ // 추상클래스(미완성클래스) -> 객체 생성 불가
	
	private String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract void speak() ;  //추상 메소드 
	
	void info() {
		System.out.println(name + " 입니다.");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}