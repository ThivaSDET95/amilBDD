package testProject_CalenderPick;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class eliminateDuplicateNum {

	public static void main(String[] args) {
		
		
		int arr[]= {9,9,4,6,8,5,3,1,2,4};
		TreeSet<Integer> hs=new TreeSet<Integer>();
	
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
 Iterator<Integer> itr=   hs.iterator();
 while(itr.hasNext()) {
	 System.out.print(itr.next()+", ");
 }
	}


}
