package helloworld;

public class HelloWorld {
	
	public static void main(String args[]) {
		
		int age = 30; // Create variable called age and assign value 30
		String name = "Jerry"; // Create variable called name and assign value Jerry
		System.out.println("My name is: " + name);
		System.out.println("I am: " + age + " years old");
		
		// if...else statement
		int time = 22;
		if (time < 10) {
			System.out.println("Good morning!");
		} else if (time < 20) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}
		
		// switch statement
		int color = 2;
		switch (color) {
			case 1:
				System.out.println("Red");
				break;
			case 2:
				System.out.println("Blue");
				break;
			case 3:
				System.out.println("Green");
				break;
		}
		
		// while loop
		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i++;
		}
		
		// for loop
		for (int j = 10; j <= 40; j = j + 10) {
			System.out.println(j);
		}
		
		// for loop can also be used for arrays
		int[] numbers = {10, 3, 7, 4, 8};
		
		for (int n = 0; n < numbers.length; n++) {
			System.out.println(numbers[n]);
		}
		
		// for-each loop (used to loop through elements in an array)
		String[] cars = {"Honda", "Lexus", "BMW"};
		
		for (String z : cars) {
			System.out.println(z);
		}
		
		// for-each loop can also be used for array
		String[] cars2 = {"Acura", "Tesla", "Corvette"};
		
		for (String m : cars2) {
			System.out.println(m);
		}
		
	}

}
