package String;
//change every words first character into capital letter
 
public class Prog11 {
	
	public static void main(String[] args) {
		
		String str = "tom is becoming a programmer";
		str = " " + str;
		String output = "";
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch ==' ') {
				output = output + ch;
				i++;
				ch = str.charAt(i);
				output = output + Character.toUpperCase(ch);
			}
			
			else {
				output = output+ch;
			}
			
		}
		output = output.trim();
		System.out.println(output);		
		
}
}