package classandobjects;

public class MyClass {
	
	// Create class attributes (AKA fields or variables) and assign values to them
	String fname = "Jerry";
	String lname = "Vu";
	int age = 30;
	
	public static void main(String args[]) {
		MyClass myObj = new MyClass(); // Create an object called myObj of MyClass class
		System.out.println("My name is " + myObj.fname + " " + myObj.lname);
		System.out.println("I am " + myObj.age + " years old");
		
	}

}
