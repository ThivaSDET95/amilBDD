package testProject_CalenderPick;

public class occurranceOfEachCharacters {

	public static void main(String[] args) {
		String str="ThivakarKarthika";
		
		char toFind='k';
		int occurrance=0;
		str=str.toLowerCase();
		System.out.println(str);
		
for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i)==toFind) {
		occurrance++;
		
		
	}
	
}
System.out.println("occurrance of "+toFind+ " is = "+occurrance );
	}

}
