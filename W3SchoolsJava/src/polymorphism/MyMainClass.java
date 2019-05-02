// Have many classes that are related to each other by inheritance

package polymorphism;

// Superclass
class Animal{
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

// Subclass
class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: OINK OINK!");
	}
}

// Subclass
class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: WOOF WOOF!");
	}
}

public class MyMainClass {
	
	public static void main(String args[]) {
		
		Animal myAnimal = new Animal(); // Create a Animal object (myAnimal)
		Animal myPig = new Pig(); // Create a Pig object (myPig)
		Animal myDog = new Dog(); // Create a Dog object (myDog)
		
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		
	}

}
