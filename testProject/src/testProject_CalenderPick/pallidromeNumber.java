package testProject_CalenderPick;

public class pallidromeNumber {

	public static void main(String[] args) {
		
		int number=1221;
		int rem=0;
		int temp=number;
		
		while (number>0) {
			
			rem=rem*10+number%10;
			number=number/10;
			
		}
if (rem==temp) {
	System.out.println("pallidrome");
	
}
else {
	System.out.println("non pallidrome");
}
	

	}

}
