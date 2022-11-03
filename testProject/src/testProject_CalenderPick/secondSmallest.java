package testProject_CalenderPick;



public class secondSmallest {


	public static int getSecondSmall(int arr[]) {

		int small=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i]<small) {
				small=arr[i];
			}
			if (arr[i]>small && arr[i]<secondSmall) {
				secondSmall=arr[i];

			}

		}
		return secondSmall;

	}
	public static void main(String[] args) {
		int arr[]= {10,21,3,1,6,71,8,12};

		int result	=getSecondSmall(arr);
		System.out.println(result);
	}
}



