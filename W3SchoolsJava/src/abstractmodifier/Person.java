// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

package abstractmodifier;

abstract class Person {
	
	public String fname = "Jerry";
	public int age = 30;
	public abstract void study(); // Abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
	public int graduationYear = 2018;
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}
