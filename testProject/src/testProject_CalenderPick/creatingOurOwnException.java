package testProject_CalenderPick;

public class creatingOurOwnException extends Exception {

	int age;
	public creatingOurOwnException(int age) {
		this.age=age;
		System.out.println("Hey your age is "+age);
	}
	
	public static void userAge(int uAge) {
		if (uAge<21) {
			
			try {
			throw new creatingOurOwnException(uAge);
			}
			
			catch (creatingOurOwnException e) {
				System.out.println("You are un autorized on this site");
			}
			
		}
	}
	
	
}
