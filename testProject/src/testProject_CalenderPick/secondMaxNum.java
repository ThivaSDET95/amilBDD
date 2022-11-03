package testProject_CalenderPick;

public class secondMaxNum {
	

		public static void main(String[] args) {
			
			int arr[]= {10,11,5,8,15,12};
			
			int max=Integer.MIN_VALUE;
			int s_max=Integer.MIN_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]>max) {
					max=arr[i];
				}
				if (arr[i]<max && arr[i]>s_max) {
					s_max=arr[i];

				}
				
			}
			
			System.out.println("2nd max #" +s_max);
			System.out.println("1st max #" +max);
		}

	}



