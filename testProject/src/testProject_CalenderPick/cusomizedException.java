package testProject_CalenderPick;

public class cusomizedException extends Exception {

	 cusomizedException(int age) {
		System.out.println("your age is " +age);
	}
	
	public static void getage(int age) {
		if (age<21) {
			
		try {
			
			throw new cusomizedException(age);
		}
		
		catch (cusomizedException e) {
			System.out.println("You are under age for marriage");
		}
		
	}
		else {
			System.out.println("You are "+age+" older");
		}
	
	}
}
