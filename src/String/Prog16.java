package String;
//fetch special characters
public class Prog16 {
	public static void main(String[] args) {
	
		String str = "international@125*48flight";
		System.out.println(str.indexOf('@'));
		System.out.println(str.indexOf('f'));
		str=str.substring(13, 20);
		System.out.println(str);
	}
}
