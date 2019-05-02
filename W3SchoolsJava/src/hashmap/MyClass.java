package hashmap;

import java.util.HashMap; // Import HashMap class

public class MyClass {
	
	public static void main(String args[]) {
		
		// Create a HashMap object called people
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		// Add keys and values (Name, Age)
		people.put("Jerry", 30);
		people.put("Emma", 5);
		people.put("James", 40);
		
		// Use for each loop to print keys and value
		for (String i : people.keySet()) {
			System.out.println("Name: " + i + " "+ "Age: " + people.get(i));
		}
	}

}
