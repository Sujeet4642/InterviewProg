package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//Hash map Program
public class Prog20 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",5);
		
		//Entry interface returns the collection view of map
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}
}
