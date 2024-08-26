package ex03;

public class MainAnimal {

	public static void main(String[] args) {
		
		Dog dog = new Dog("강아지", 5);
		dog.info();
		dog.speak();
//		System.out.println(dog.age + "살 입니다.");
		
		Cat cat = new Cat("고양이", 3);
		cat.info();
		cat.speak();
	}

}
