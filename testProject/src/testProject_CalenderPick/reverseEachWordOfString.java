package testProject_CalenderPick;

public class reverseEachWordOfString {

	public static void main(String[] args) {
		String myRole="my life my rules";
		String[] arr= myRole.split(" ");
		String finalRev=" ";
		for (String indWord : arr) {
		int iLen=	indWord.length();
		String iRev=" ";
		for (int i = iLen-1; i>=0; i--) {
			iRev =iRev+indWord.charAt(i);
		}
		finalRev=finalRev+iRev+" ";
		}
	System.out.println(finalRev);
	}

}
