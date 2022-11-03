package testProject_CalenderPick;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class noRepeatedChar {
	public static void main(String[] args) {
		String ambition="I wanna become an engineer";
		String st= ambition.toLowerCase();
		System.out.println(st);
//	int result=	ambition.length()-ambition.replaceAll("I", "").length();
//	System.out.println(result);
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
	char[] charArr=	ambition.toCharArray();
		int count=1;
		for (int i = 0; i < charArr.length; i++) {
			if (!map.containsKey(charArr[i])) {
				map.put(charArr[i], count);
			}
			else {
				map.put(charArr[i], map.get(charArr[i])+1);
			}
		}
		for (Character key : map.keySet()) {
//			System.out.println("The occurr count for "+key+ " = "+map.get(key) );
			if (map.get(key)<2) {
				System.out.println("Non repeated values ----- "+key+" = "+map.get(key));
				
			}
			
		}
	}

}
