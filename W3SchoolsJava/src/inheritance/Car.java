// Uses extend keyword for the subclass/child class (Car) to inherit attributes and methods from the superclass/parent class (Vehicle)
// This is useful for code reusability: reuse attributes and methods of an existing class when you create a new class

package inheritance;

class Vehicle{
	
	protected String brand = "Honda"; // Vehicle attribute/variable
	
	public void honk() { // Vehicle method
		System.out.println("HONK HONK!");
	}
	
}

public class Car extends Vehicle {
	
	private String modelName = "Civic"; // Car attribute/variable
	
	public static void main(String args[]) {
		
		// Create myCar object
		Car myCar = new Car();
		
		// Call the honk() method (from the Vehicle class) on the myCar object
		myCar.honk();
		
		// Display the value of brand attribute/variable (from the Vehicle class) and the value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.modelName);
		
	}

}
