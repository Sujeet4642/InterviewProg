package Basics;

public class IfElse {
public static void main(String[] args) {
	int month = 7;
	String  season;
	
	if(month == 1 || month ==2 || month == 3) {
		season = "winter";
	}
	else if(month == 4 || month ==5 || month == 6){
		season = "summer";
	}
	else if(month == 7 || month ==8 || month == 9) {
		season = "spring";
	}
	else {
		season = "vogus month";
	}
	System.out.println("february is in the " + season + ".");
}

}