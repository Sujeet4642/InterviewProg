package String;
//explain string is immutable
public class StringImmutableConcept {
	public static void main(String[] args) {
	String str = "java";
	str.concat(" rules");
	System.out.println("str refers: " +str);
	
	
	//output is- s1 refers: java
	
	String s = str;//or dont need to use s
	str=str.concat(" rules");
	System.out.println(str);
	}
}
