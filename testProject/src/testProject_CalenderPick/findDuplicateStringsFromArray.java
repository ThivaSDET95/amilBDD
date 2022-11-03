package testProject_CalenderPick;

import java.util.ArrayList;
import java.util.List;

public class findDuplicateStringsFromArray {

	public static void main(String[] args) {

		String [] arr= {"thiva1","siva1","thiva1","siva","siva1","sam","thiva"};
	
		
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("duplicate string is "+arr[i]);
					flag=true;
				}

			}	
		}
		if (flag==false) {
			System.out.println("duplicate string is nothing");
		}
	}

}
