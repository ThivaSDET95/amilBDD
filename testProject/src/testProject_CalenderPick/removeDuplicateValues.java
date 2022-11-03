package testProject_CalenderPick;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateValues {

	public static void main(String[] args) {
		int [] arr= {1,2,2,3,4,4,5,6,5,7,8,9};
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
	Iterator<Integer>	itr=set.iterator();
	while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
	}
	}

}
