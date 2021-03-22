package Basics;

public class Loop {
	
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			System.out.println("count no. - " +i);
			
			if(i==10)
				break;
			System.out.println("i: " + i);
		}
		
	}

}
