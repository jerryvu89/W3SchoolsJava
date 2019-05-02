package classmethods;

public class MyClass {
	
	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
	
	public static void main(String args[]) {
		myStaticMethod(); // Call the Static method (DOES NOT NEED TO CREATE AN OBJECT)
		
		MyClass myObj = new MyClass(); // Create object (myObject) of MyClass
		myObj.myPublicMethod(); // Call the Public method on the object
		
	}

}
