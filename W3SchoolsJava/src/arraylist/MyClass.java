package arraylist;

// Can import java.util.* instead of the two class below
import java.util.ArrayList; // import ArrayList class
import java.util.Collections; // import Collections class

public class MyClass {
	
	public static void main(String args[]) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Indigo");
		colors.add("Violet");
		
		// Print using for loop
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		System.out.println("Now sort the colors");
		
		// Sort colors
		Collections.sort(colors);
		
		// Print using for each loop
		for (String a : colors) {
			System.out.println(a);
		}
		
		
	}

}
