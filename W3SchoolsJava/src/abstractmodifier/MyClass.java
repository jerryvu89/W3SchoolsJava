// An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

package abstractmodifier;

public class MyClass {
	
	public static void main(String args[]) {
		// Create an object (myObj) of Student class (which inherits attributes and methods from Person)
		Student myObj = new Student();
		
		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year: " + myObj.graduationYear);
		myObj.study(); // Call abstract method
	}

}
