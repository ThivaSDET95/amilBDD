package testProject_CalenderPick;

public class occurrenceOfAnInteger {

	public static void main(String[] args) {
		
		int[] arr= {1,5,5,6,4,4,6};
		int toFind=5;
		int occurrence=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==toFind) {
				
				occurrence++;
			}
		}

		System.out.println("the occurrence of "+toFind+" is "+occurrence);
	}

}
