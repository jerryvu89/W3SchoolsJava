// Interface is an abstract "class" that is used to group related methods with empty bodies
// It is used to hide certain details and only show the important details of an object (interface)
// This uses multiple interface

package interfaces;

interface FirstInterface {
	public void myMethod(); // interface method()
}

interface SecondInterface {
	public void myOtherMethod(); // interface method()
}

// 
class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text from myMethod()...");
	}
	public void myOtherMethod() {
		System.out.println("Some text from myOtherMethod()...");
	}
}

public class MyMainClass {
	
	public static void main(String args[]) {
		
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}
