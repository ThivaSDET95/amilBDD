package testProject_CalenderPick;

import java.util.HashMap;
import java.util.Map;

public class repeatedStringsCount {

	public static void main(String[] args) {
		String thivaKarthika="Karthika is thiva's princess princess";
		Map<String, Integer> hashMap=new HashMap<String, Integer>();
		Integer count=1;
		
		String[] arr= thivaKarthika.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], count);
			}
			else {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			}
		}
for (String key :hashMap.keySet() ) {
//	if (key.equals("Karthika")) {
		System.out.println("The word count of " +key+" is = "+hashMap.get(key));
//	}
	
	
	
}
		
	}

}
