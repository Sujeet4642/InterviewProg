package String;
//programme to change single character to uppercase and remaining to lowercase
public class Prog10 {
	public static void main(String[] args) {
		
		String str = "I wIlL BeComE A aUtoMatiOn tESTEr";
		String temp[] = str.split(" ");
		String output = "";
		System.out.println(temp.length);
		//for continues running String acc to wordwise 
		for(int i=0;i<temp.length;i++) {
			
		//now process for chracterwise because need to change some char to lowercase
			char word[] = temp[i].toCharArray();
			String test = "";
			for(int j=0;j<word.length;j++) {
				
				if(j==0) {
					test = test+word[j];
					test = test.toUpperCase();
					
				}
				else {
					test = test+word[j];
					test = test.toLowerCase();
				}
			
				
			}
			output = output + test + " ";
		
		}	
			System.out.println(output);
			
		
		
		
	}
	}


