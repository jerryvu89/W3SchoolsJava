// Constructor with two parameters

package constructors;

public class Car {
	
	int modelYear; // Create variable modelYear
	String modelName; // Create variable modelName
	
	// Constructor with two parameters
	public Car(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String args[]) {
		Car myCar = new Car(2015, "Honda");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
