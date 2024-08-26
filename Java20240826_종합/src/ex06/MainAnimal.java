package ex06;

public class MainAnimal {

	public static void main(String[] args) {
		
		//Animal an = new Animal();
		
		Dog dog = new Dog("강아지", 5);		
		dog.speak();

		
		Cat cat = new Cat("고양이", 3);	
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}

}
