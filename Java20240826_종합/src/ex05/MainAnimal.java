package ex05;

public class MainAnimal {

	public static void main(String[] args) {
		speakTest(new Animal());	
		speakTest(new Cat());	
		speakTest(new Dog());	
		speakTest(new 진도개());	
		
		
	}
	
	static void speakTest(Animal an) {
		an.speak();
	}

}
