package testProject_CalenderPick;

import java.util.Arrays;

public class listOPrime {

	public static void main(String[] args) {
		int [] arr= {2,4,6,7,8,10,12,3,11,13};
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>1) {
				
				int count=0;
				for (int j = 1; j <=arr[i]; j++) {
					
					if (arr[i]%j==0) {
						count++;
					}
					if (count==2) {
						System.out.println("the number "+arr[i]+ " a prime");
					}
				}
			}
			else {
				System.out.println("the number "+arr[i]+ " not a prime");
			}
		}

	}

}
