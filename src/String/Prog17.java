package String;
//remove special characters using regular expression
public class Prog17 {
	public static void main(String[] args) {
		String str = "Welcome To /*-+@%$* Java01234";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
