package testProject_CalenderPick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class reverseIntegers {

	public static void main(String[] args) {
		int [] arr={10,23,45,65,34,53};
	
		List<Integer> reverseInt=new ArrayList<Integer>();
		
		for (int i = arr.length-1; i>=0; i--) {
	
		reverseInt.add(arr[i]);
		}
System.out.println(reverseInt);
    Iterator<Integer>   itr  =reverseInt.iterator();
    while (itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	}

}
