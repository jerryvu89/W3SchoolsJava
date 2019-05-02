package scannerpackage;
import java.util.*; // This imports the whole class package or can use java.util.Scanner instead

public class MyClass {

	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");
		
		String userName = myObj.nextLine(); // Create nextLine() method which reads complete line
		System.out.println("Username is: " + userName); // Print the user's input
		
		System.out.println("Enter name, age and salary");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary);
		
	}

}
