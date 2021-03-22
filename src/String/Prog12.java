package String;
//program to CONVERT "O" INTO uppercase
public class Prog12 {
	public static void main(String[] args) {
		
		String str = "The compiled code of java can run on mac linux or windows if jre is available on the operating system";
		String[] temp = str.split(" ");
		//System.out.print(temp.length);
		String output ="";
		
		for(int i=0;i<temp.length;i++) {
			char word[] = temp[i].toCharArray();
			String test = "";
			//System.out.print(word.length);
			for(int j=0;j<word.length;j++) {
				if(word[j]=='o') {
					test = test + word[j];
					test= test.toUpperCase();
				}
				else {
					
					test = test + word[j];
				}
			}
		    output = output+test+" ";
			
		}
		System.out.println(output);
		
		
	}

}
