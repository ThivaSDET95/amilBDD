package testProject_CalenderPick;

public class largestNumber {

	public static void main(String[] args) {
		int [] arr= {10,15,20,12,30,25};
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
		}
System.out.println(max);
	}

}
