package testProject_CalenderPick;




public class secondSmallNumber {

	public static void main(String[] args) {
		
		int arr[]= {2500,1500,3500,3800,8090,2000};
		
		int min=Integer.MAX_VALUE;
		int s_min=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
			if (arr[i]>min && arr[i]<s_min) {
				s_min=arr[i];

			}
			
		}
		
		System.out.println("2nd min #" +s_min);
	}

}
