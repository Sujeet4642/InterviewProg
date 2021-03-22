package String;
//arrange string in increasing order
public class Prog4 {
	public static void main(String[] args) {
		
		String[] names = {"sujeet","amit","rupesh","sachin","deepak","ani"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
					
				}
			}
			System.out.println(names[i]);
		}
	      /*for(int i=0;i<names.length;i++) {
	    	  System.out.println(names[i]);
	      }*/
	}

}
