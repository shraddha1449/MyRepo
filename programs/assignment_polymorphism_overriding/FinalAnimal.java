package assignment_polymorphism_overriding;

public class FinalAnimal {

	public static void main(String[] args) {
		
		Dog obj1 = new Dog();
		Cat obj2 = new Cat();
		Pig obj3 = new Pig();
		
		obj1.printSound();
		obj2.printSound();
		obj3.printSound();
	}

}
