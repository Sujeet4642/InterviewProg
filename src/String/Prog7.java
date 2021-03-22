package String;
//reverse a string
public class Prog7 {
	public static void main(String[] args) {
		String  str = "ABCD";
		String rev = "";
	    /*int leng = str.length();
		for(int i=leng-1;i>=0;i--) {
			rev = rev+str.charAt(i);
	}*/
		
		//or
	    char a[] = str.toCharArray();
	    int len = a.length;
	    for(int i=len-1;i>=0;i--) {
	    	rev = rev+a[i];
	    }
			//or
			/*StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());*/
	    
		
		
		System.out.println(rev);
	}

}
