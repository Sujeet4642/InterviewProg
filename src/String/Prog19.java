package String;
//count occurrences of word in string
import java.util.HashMap;

public class Prog19 {
	public static void main(String[] args) {
		String str = "India is my country and I love India";
		String words[] = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String occ : words) {
			if(map.containsKey(occ)) {
				int value=map.get(occ);
				map.put(occ, value+1);
			}
			else {
				map.put(occ, 1);
			}
		}
		System.out.println(map);
	}

}
