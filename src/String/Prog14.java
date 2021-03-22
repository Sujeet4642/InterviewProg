package String;
//count occurrence of specific character
public class Prog14 {
	public static void main(String[] args) {
		String str = "java programming java oops";
		/*int totalcount=str.length();
		System.out.println(totalcount);
		int totalcount_afterRemove_a=str.replace("a", "").length();
		System.out.println(totalcount_afterRemove_a);
		int count = totalcount-totalcount_afterRemove_a;
		System.out.println("occurance af a is : " + count);*/
		
		char[] arr= str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a') {
				count++;
			}
		}
		System.out.println("occurance of a is : " +count);
	}

}
