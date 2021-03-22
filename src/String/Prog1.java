package String;
//swapping of two numbers
public class Prog1 {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping values are : " +a+ " " +b);
		int temp = a;
		a = b;
		b = temp;
		
		//without using third variable
		//a = a+b;
		//b = a-b;
		//a = a-b;
		System.out.println("After swapping values are  : " +a+ " " +b);
	}

}
