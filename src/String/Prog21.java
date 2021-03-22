package String;

import java.util.HashMap;
import java.util.Map;

public class Prog21 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
	
		
	//fetch one value
		if(map.containsKey("vishal")) {
			int a = map.get("vishal");
			System.out.println("value for key vishal is "   + a);
		}
		
	//fetch all values
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			//String key = entry.getKey();
			//int value = entry.getValue();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}

}
