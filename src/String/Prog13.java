package String;

public class Prog13 {
	public static void main(String[] args) {
		String str = "common name";
		int count=0;
		char ch[]=str.toCharArray();
		 System.out.println("dup charcters are: ");
		for(int i=0;i<ch.length;i++) {
		  for(int j=i+1;j<ch.length;j++) {
			  
			  if(ch[i]==ch[j]) {
				  count++;
				  System.out.print(ch[j] + " ");
			  }
			  
		  }
		}
		System.out.println();
		System.out.println("dup charcters are - " +count);
	}

}
