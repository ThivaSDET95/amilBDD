package testProject_CalenderPick;

public class pallindromeString {

	public static void main(String[] args) {
		String str="nivii";
		int len=str.length();
		String rev="";
		
		for (int i = len-1; i>=0; i--) {
			rev=rev+ str.charAt(i);	
		}
		if (str.equals(rev)) {
			System.out.println("pallindrome string");
			
		}
		else {
			System.out.println("Non pallindrome string");
		}
System.out.println(rev);
	}

}
