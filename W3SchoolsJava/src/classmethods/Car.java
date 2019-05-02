package classmethods;

public class Car {
	
	// Create fullThrottle() method
	public void fullthrottle() {
		System.out.println("The car is going fast!");
	}
	
	// Create speed() method
	public void speed(int maxSpeed) {
		System.out.println("The max speed is: " + maxSpeed);
	}
	
	// Inside main, call the methods on the myCar object
	public static void main(String args[]) {
		Car myCar = new Car(); // Create object (myCar) of Car class
		myCar.fullthrottle(); // Call fullThrottle() method
		myCar.speed(200); // Call speed() method
	}

}
