// Hides sensitive data from users using private variables
// Setter and getter methods are used to access and update the private values

package encapsulation;

public class MyClass {
	
	public static void main(String args[]) {
		Person myObj = new Person();
		myObj.setName("Jerry"); // Set the value of the name variable to Jerry
		System.out.print(myObj.getName()); // Print the name
	}

}
