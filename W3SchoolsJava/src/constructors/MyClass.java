// Constructors are methods that are used to initialize objects
// It is called when an object of a class is created
// It can be used to set initial values for object attributes (variables or fields)

package constructors;

public class MyClass {
	
	int x; // Create a variable (AKA attribute or field)
	
	// Create a constructor for the variable x
	public MyClass() {
		x = 5; // Set the initial value for the attribute
	}
	
	public static void main(String args[]) {
		MyClass myObj = new MyClass(); // Create an object (myObj) of class (MyClass). This will call the constructor
		System.out.println(myObj.x); // Print the value of x
	}

}
