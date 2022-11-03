package testProject_CalenderPick;

import java.util.HashMap;
import java.util.Map;

public class occurranceOfEachElements {

	public static void main(String[] args) {
		int [] arr = {1,3,2,1,5,4,3,8};
		int count=1;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
					}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for (int key : map.keySet()) {
			System.out.println("occurrance of "+key+ " is "+map.get(key));
			
		}

	}

}
