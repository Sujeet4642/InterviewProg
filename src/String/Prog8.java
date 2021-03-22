package String;

public class Prog8 {
	public static void main(String[] args) {
		
		String str = "Coming For Thanks";
		String rev = "";
		String [] a = str.split(" ");
		
		
		/*System.out.print("Original String is : ");
		for(int i=0;i<a.length;i++) {//for fetching original string
			System.out.print(a[i] + " ");
			
		}*/
		
		//System.out.println();
		
		System.out.print("Reverse String is  : ");
		for(int i=a.length-1;i>=0;i--) {
			rev = rev + a[i] + " ";
		}
		System.out.println(rev);
	}

}
