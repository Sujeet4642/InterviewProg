package Basics;

public class NestedIfElse {

	
	public static void main(String[] args) {
		
		int month = 3;
		int day = 24;
		String season;
		
		if(month == 12 || month == 1 || month == 2) {
			System.out.println(season = "winter");
		}
		
		else if(month == 3 || month == 4 || month == 5){
			System.out.println(season = "spring");
			
			if(day==24){
				System.out.println("its special ocassion");
			}
			
		else if(month == 7 || month == 8 || month == 9) {
			System.out.println(season = "summer");
		}	
		
		else {
			System.out.println(season = "bogus month");
		}	
			
		}
		
		}
	}
		
	
	