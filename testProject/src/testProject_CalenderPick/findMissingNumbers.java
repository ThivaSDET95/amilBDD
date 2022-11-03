package testProject_CalenderPick;

import java.util.Arrays;

public class findMissingNumbers {

	public static void main(String[] args) {
		
int [] arr1= {1,2,3,4,5,6,7,8,10};
int actual=0;
int Expected=0;


for (int i = 0; i < arr1.length; i++) {
	actual=actual+arr1[i];
}
	for (int j = 1; j<=10; j++) {
		Expected=Expected+j;
			
}
//	System.out.println(Arrays.toString(arr1));
	System.out.println(Expected-actual);
		
	}

}
