// Hides sensitive data from users using private variables
// Setter and getter methods are used to access and update the private values

package encapsulation;

public class Person {
	
	private String name; // private = restricted access
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	

}
