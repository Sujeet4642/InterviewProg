package String;
//sort in ascending order
public class prog2 {
	public static void main(String[] args) {
		
	int[] arr = {50,10,70,40,20};
	
	System.out.println("Before : ");
	//for fetching list
	//for(int i=0;i<arr.length;i++) {
		//System.out.println(arr[i]);
	//}
	  for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]>arr[j]) {
				  //for swapping
				  int temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
			  }
		  }
		  System.out.println(arr[i]);
	  }
	 /* System.out.println("After : ");
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }*/
	}
}
