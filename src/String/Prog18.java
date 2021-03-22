package String;

import java.util.HashMap;
import java.util.Map;

//count occurrences of each character in string
public class Prog18 {
	public static void main(String[] args) {
		String str="java";
		HashMap<Character, Integer>count = new HashMap<>();
		for(Character c:str.toCharArray()) {
			if(count.containsKey(c)) {
				int value=count.get(c);
				count.put(c, value+1);
			}
			else {
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}

}
